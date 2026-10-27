package com.prekogdevs.chirp.infra.mappers

import com.prekogdevs.chirp.domain.model.DeviceToken
import com.prekogdevs.chirp.infra.database.DeviceTokenEntity

fun DeviceTokenEntity.toDeviceToken(): DeviceToken {
    return DeviceToken(
        userId = userId,
        token = token,
        platform = platform.toPlatform(),
        createdAt = createdAt,
        id = id
    )
}