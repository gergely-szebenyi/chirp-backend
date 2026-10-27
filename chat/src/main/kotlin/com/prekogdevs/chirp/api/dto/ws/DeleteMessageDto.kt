package com.prekogdevs.chirp.api.dto.ws

import com.prekogdevs.chirp.domain.type.ChatId
import com.prekogdevs.chirp.domain.type.ChatMessageId

data class DeleteMessageDto(
    val chatId: ChatId,
    val messageId: ChatMessageId
)
