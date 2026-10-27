package com.prekogdevs.chirp.service

import com.prekogdevs.chirp.api.dto.ChatMessageDto
import com.prekogdevs.chirp.infra.database.mappers.toChatMessageDto
import com.prekogdevs.chirp.domain.exception.ChatNotFoundException
import com.prekogdevs.chirp.domain.exception.ChatParticipantNotFoundException
import com.prekogdevs.chirp.domain.exception.ForbiddenException
import com.prekogdevs.chirp.domain.exception.MessageNotFoundException
import com.prekogdevs.chirp.domain.models.ChatMessage
import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.ChatMessageId
import com.prekogdevs.chirp.domain.type.UserId
import com.prekogdevs.chirp.infra.database.entities.ChatMessageEntity
import com.prekogdevs.chirp.infra.database.mappers.toChatMessage
import com.prekogdevs.chirp.infra.database.repositories.ChatMessageRepository
import com.prekogdevs.chirp.infra.database.repositories.ChatParticipantRepository
import com.prekogdevs.chirp.infra.database.repositories.ChatRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.Instant

@Service
class ChatMessageService(
    private val chatRepository: ChatRepository,
    private val chatMessageRepository: ChatMessageRepository,
    private val chatParticipantRepository: ChatParticipantRepository
) {

    @Transactional
    fun sendMessage(
        chatId: ChatId,
        senderId: UserId,
        content: String,
        messageId: ChatMessageId? = null
    ): ChatMessage {
        val chat = chatRepository.findChatById(chatId, senderId)
            ?: throw ChatNotFoundException()
        val sender = chatParticipantRepository.findByIdOrNull(senderId)
            ?: throw ChatParticipantNotFoundException(senderId)

        val savedMessage = chatMessageRepository.save(
            ChatMessageEntity(
                id = messageId,
                content = content.trim(),
                chatId = chatId,
                chat = chat,
                sender = sender
            )
        )

        return savedMessage.toChatMessage()
    }

    @Transactional
    fun deleteMessage(
        messageId: ChatMessageId,
        requestUserId: UserId
    ) {
        val message = chatMessageRepository.findByIdOrNull(messageId)
            ?: throw MessageNotFoundException(messageId)

        if(message.sender.userId != requestUserId) {
            throw ForbiddenException()
        }

        chatMessageRepository.delete(message)
    }
}