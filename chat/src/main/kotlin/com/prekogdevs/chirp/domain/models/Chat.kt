package com.prekogdevs.chirp.domain

import com.prekogdevs.chirp.domain.models.ChatMessage
import com.prekogdevs.chirp.domain.models.ChatParticipant
import com.prekogdevs.chirp.domain.type.ChatId
import java.time.Instant

data class Chat(
    val id: ChatId,
    val participants: Set<ChatParticipant>,
    val lastMessage: ChatMessage?,
    val creator: ChatParticipant,
    val lastActivityAt: Instant,
    val createdAt: Instant
)