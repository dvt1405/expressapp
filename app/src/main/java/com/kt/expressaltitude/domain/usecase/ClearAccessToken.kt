package com.kt.expressaltitude.domain.usecase

import com.kt.expressaltitude.domain.repository.AccessTokenRepository

class ClearAccessToken(private val accessToken: AccessTokenRepository) {
    suspend operator fun invoke() = accessToken.clearToken()
}