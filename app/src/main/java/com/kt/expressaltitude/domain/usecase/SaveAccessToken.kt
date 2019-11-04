package com.kt.expressaltitude.domain.usecase

import com.kt.expressaltitude.domain.repository.AccessTokenRepository

class SaveAccessToken(private val accessTokenRepository: AccessTokenRepository) {
     operator fun invoke(token: String) = accessTokenRepository.saveAccessToken(token)

}