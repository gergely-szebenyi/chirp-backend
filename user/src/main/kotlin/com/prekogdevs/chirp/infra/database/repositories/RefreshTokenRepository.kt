package com.prekogdevs.chirp.infra.database.repositories

import com.prekogdevs.chirp.domain.model.UserId
import com.prekogdevs.chirp.infra.database.entities.RefreshTokenEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RefreshTokenRepository: JpaRepository<RefreshTokenEntity, Long> {
    fun findByUserIdAndHashedToken(userId: UserId, hashedToken: String): RefreshTokenEntity?
    fun deleteByUserIdAndHashedToken(userId: UserId, hashedToken: String)
    fun deleteByUserId(userId: UserId)
}