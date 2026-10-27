package com.prekogdevs.chirp.api.util

import com.prekogdevs.chirp.domain.exception.UnauthorizedException
import com.prekogdevs.chirp.domain.type.UserId
import org.springframework.security.core.context.SecurityContextHolder

val requestUserId: UserId
    get() = SecurityContextHolder.getContext().authentication?.principal as? UserId
        ?: throw UnauthorizedException()