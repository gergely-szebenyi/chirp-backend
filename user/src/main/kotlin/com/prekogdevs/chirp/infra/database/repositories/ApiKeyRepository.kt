package com.prekogdevs.chirp.infra.database.repositories

import com.prekogdevs.chirp.infra.database.entities.ApiKeyEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKeyEntity, String>