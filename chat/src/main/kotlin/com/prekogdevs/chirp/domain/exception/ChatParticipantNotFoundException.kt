package com.prekogdevs.chirp.domain.exception

import com.prekogdevs.chirp.domain.type.UserId

class ChatParticipantNotFoundException(
    private val id: UserId
): RuntimeException(
    "The chat participant with the ID $id was not found."
)