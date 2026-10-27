package com.prekogdevs.chirp.domain.event

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.ChatMessageId

data class MessageDeletedEvent(
    val chatId: ChatId,
    val messageId: ChatMessageId,
)
