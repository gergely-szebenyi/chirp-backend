package com.prekogdevs.chirp.infra.database.repositories

import com.prekogdevs.chirp.domain.model.UserId
import com.prekogdevs.chirp.infra.database.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}