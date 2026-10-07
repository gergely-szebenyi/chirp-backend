package com.prekogdevs.chirp.api.mappers

import com.prekogdevs.chirp.domain.model.EmailVerificationToken
import com.prekogdevs.chirp.infra.database.entities.EmailVerificationTokenEntity
import com.prekogdevs.chirp.infra.database.mappers.toUser

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser()
    )
}