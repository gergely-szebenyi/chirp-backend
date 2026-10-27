package com.prekogdevs.chirp.domain.event

import com.prekogdevs.chirp.domain.type.UserId

data class ProfilePictureUpdatedEvent(
    val userId: UserId,
    val newUrl: String?
)
