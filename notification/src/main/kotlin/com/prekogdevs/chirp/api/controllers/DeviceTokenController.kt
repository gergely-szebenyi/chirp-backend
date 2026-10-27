package com.prekogdevs.chirp.api.controllers

import com.prekogdevs.chirp.api.dto.DeviceTokenDto
import com.prekogdevs.chirp.api.dto.RegisterDeviceRequest
import com.prekogdevs.chirp.api.mappers.toDeviceTokenDto
import com.prekogdevs.chirp.api.mappers.toPlatformDto
import com.prekogdevs.chirp.api.util.requestUserId
import com.prekogdevs.chirp.service.PushNotificationService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/notification")
class DeviceTokenController(private val pushNotificationService: PushNotificationService) {

    @PostMapping("/register")
    fun registerDeviceToken(
        @Valid @RequestBody body: RegisterDeviceRequest
    ): DeviceTokenDto {
        return pushNotificationService.registerDevice(
            userId = requestUserId,
            token = body.token,
            platform = body.platform.toPlatformDto()
        ).toDeviceTokenDto()
    }

    @DeleteMapping("/{token}")
    fun unregisterDeviceToken(
        @PathVariable("token") token: String
    ) {
        pushNotificationService.unregisterDevice(token)
    }
}