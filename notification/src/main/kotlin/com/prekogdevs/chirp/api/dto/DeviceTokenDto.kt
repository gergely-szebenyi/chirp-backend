package com.prekogdevs.chirp.api.dto

import com.prekogdevs.chirp.domain.type.UserId
import java.time.Instant

data class DeviceTokenDto(
    val userId: UserId,
    val token: String,
    val createdAt: Instant
)
