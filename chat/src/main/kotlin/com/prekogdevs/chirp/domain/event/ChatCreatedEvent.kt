package com.prekogdevs.chirp.domain.event

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.UserId

data class ChatCreatedEvent(
    val chatId: ChatId,
    val participantIds: List<UserId>
)
