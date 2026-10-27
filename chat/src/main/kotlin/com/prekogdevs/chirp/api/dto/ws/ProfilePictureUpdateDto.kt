package com.prekogdevs.chirp.api.dto.ws

import com.prekogdevs.chirp.domain.type.UserId

data class ProfilePictureUpdateDto(
    val userId: UserId,
    val newUrl: String?
)
