package com.prekogdevs.chirp.domain.event

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.UserId

data class ChatParticipantsJoinedEvent(
    val chatId: ChatId,
    val userIds: Set<UserId>
)
