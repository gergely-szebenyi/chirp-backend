package com.prekogdevs.chirp.api.dto

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.ChatMessageId
import com.prekogdevs.chirp.domain.type.UserId
import java.time.Instant

data class ChatMessageDto(
    val id: ChatMessageId,
    val chatId: ChatId,
    val content: String,
    val createdAt: Instant,
    val senderId: UserId
)