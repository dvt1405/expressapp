package com.kt.expressaltitude.domain.usecase

import androidx.lifecycle.LiveData
import com.kt.expressaltitude.domain.repository.AccessTokenRepository

class GetAccessToken(private val accessTokenRepository: AccessTokenRepository) {
    operator fun invoke(id: String) = accessTokenRepository.getAccessToken(id)
}