package com.prekogdevs.chirp.domain.event

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.UserId

data class ChatParticipantLeftEvent(
    val chatId: ChatId,
    val userId: UserId
)
