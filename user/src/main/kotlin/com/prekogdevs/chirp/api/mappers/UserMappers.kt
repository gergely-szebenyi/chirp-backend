package com.prekogdevs.chirp.api.mappers

import com.prekogdevs.chirp.api.dto.AuthenticatedUserDto
import com.prekogdevs.chirp.api.dto.UserDto
import com.prekogdevs.chirp.domain.model.AuthenticatedUser
import com.prekogdevs.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}