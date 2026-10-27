package com.prekogdevs.chirp.infra.database.mappers

import com.prekogdevs.chirp.domain.model.ApiKey
import com.prekogdevs.chirp.infra.database.entities.ApiKeyEntity

fun ApiKeyEntity.toApiKey(): ApiKey {
    return ApiKey(
        key = key,
        validFrom = validFrom,
        expiresAt = expiresAt,
    )
}