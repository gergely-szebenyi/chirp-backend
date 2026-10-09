package com.prekogdevs.chirp.api.dto

import com.prekogdevs.chirp.util.Password
import jakarta.validation.constraints.NotBlank

data class ChangePasswordRequest(
    @field:NotBlank
    val oldPassword: String,
    @field:Password
    val newPassword: String
)