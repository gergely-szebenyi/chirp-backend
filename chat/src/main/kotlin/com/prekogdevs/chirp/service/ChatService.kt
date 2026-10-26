package com.prekogdevs.chirp.service

import com.prekogdevs.chirp.domain.exception.ChatParticipantNotFoundException
import com.prekogdevs.chirp.domain.exception.InvalidChatSizeException
import com.prekogdevs.chirp.domain.models.Chat
import com.prekogdevs.chirp.domain.type.UserId
import com.prekogdevs.chirp.infra.database.entities.ChatEntity
import com.prekogdevs.chirp.infra.database.mappers.toChat
import com.prekogdevs.chirp.infra.database.repositories.ChatParticipantRepository
import com.prekogdevs.chirp.infra.database.repositories.ChatRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ChatService(
    private val chatRepository: ChatRepository,
    private val chatParticipantRepository: ChatParticipantRepository,
) {

    @Transactional
    fun createChat(
        creatorId: UserId,
        otherUserIds: Set<UserId>
    ): Chat {
        val otherParticipants = chatParticipantRepository.findByUserIdIn(
            userIds = otherUserIds
        )

        val allParticipants = (otherParticipants + creatorId)
        if(allParticipants.size < 2) {
            throw InvalidChatSizeException()
        }

        val creator = chatParticipantRepository.findByIdOrNull(creatorId)
            ?: throw ChatParticipantNotFoundException(creatorId)

        return chatRepository.save(
            ChatEntity(
                creator = creator,
                participants = setOf(creator) + otherParticipants
            )
        ).toChat(lastMessage = null)
    }
}