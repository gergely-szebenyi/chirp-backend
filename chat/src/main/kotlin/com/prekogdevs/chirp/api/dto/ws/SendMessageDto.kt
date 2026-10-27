package com.prekogdevs.chirp.api.dto.ws

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.ChatMessageId

data class SendMessageDto(
    val chatId: ChatId,
    val content: String,
    val messageId: ChatMessageId? = null
)
