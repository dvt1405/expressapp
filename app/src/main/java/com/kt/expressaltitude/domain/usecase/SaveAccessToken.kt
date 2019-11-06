package com.kt.expressaltitude.domain.usecase

import android.content.Context
import com.kt.expressaltitude.domain.repository.AccessTokenRepository

class SaveAccessToken(private val accessTokenRepository: AccessTokenRepository) {
     operator fun invoke(token: String,context: Context) = accessTokenRepository.saveAccessToken(token)

}