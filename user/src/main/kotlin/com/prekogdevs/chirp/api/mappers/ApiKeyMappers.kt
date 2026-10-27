package com.prekogdevs.chirp.api.mappers

import com.prekogdevs.chirp.api.dto.ApiKeyDto
import com.prekogdevs.chirp.domain.model.ApiKey

fun ApiKey.toApiKeyDto(): ApiKeyDto {
    return ApiKeyDto(
        key = key,
        validFrom = validFrom,
        expiresAt = expiresAt,
    )
}