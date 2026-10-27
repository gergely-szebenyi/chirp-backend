package com.prekogdevs.chirp.domain.exception

import com.prekogdevs.chirp.domain.type.ChatMessageId

class MessageNotFoundException(
    private val id: ChatMessageId
): RuntimeException(
    "Message with ID $id not found"
)