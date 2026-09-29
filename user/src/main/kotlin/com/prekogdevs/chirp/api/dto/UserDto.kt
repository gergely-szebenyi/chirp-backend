package com.prekogdevs.chirp.api.dto

import com.prekogdevs.chirp.domain.model.UserId

data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean,
)