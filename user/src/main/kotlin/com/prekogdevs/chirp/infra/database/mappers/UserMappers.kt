package com.prekogdevs.chirp.infra.database.mappers

import com.prekogdevs.chirp.domain.model.User
import com.prekogdevs.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}