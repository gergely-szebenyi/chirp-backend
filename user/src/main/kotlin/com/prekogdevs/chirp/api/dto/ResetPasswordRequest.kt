package com.prekogdevs.chirp.api.dto

import com.prekogdevs.chirp.util.Password
import jakarta.validation.constraints.NotBlank

data class ResetPasswordRequest(
    @field:NotBlank
    val token: String,
    @field:Password
    val newPassword: String
)