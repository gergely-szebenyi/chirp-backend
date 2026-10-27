package com.prekogdevs.chirp.api.dto.ws

import com.prekogdevs.chirp.domain.type.ChatId

data class ChatParticipantsChangedDto(
    val chatId: ChatId
)
