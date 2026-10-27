package com.prekogdevs.chirp.api.mappers

import com.prekogdevs.chirp.api.dto.PictureUploadResponse
import com.prekogdevs.chirp.domain.models.ProfilePictureUploadCredentials

fun ProfilePictureUploadCredentials.toResponse(): PictureUploadResponse {
    return PictureUploadResponse(
        uploadUrl = uploadUrl,
        publicUrl = publicUrl,
        headers = headers,
        expiresAt = expiresAt
    )
}