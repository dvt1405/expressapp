package com.kt.expressaltitude

import android.app.Application
import android.content.Context
import com.kt.expressaltitude.domain.AccessTokenDataSource
import com.kt.expressaltitude.domain.Iteractors
import com.kt.expressaltitude.domain.TokenLocalDataSource
import com.kt.expressaltitude.domain.repository.AccessTokenRepository
import com.kt.expressaltitude.domain.repository.AccessTokenRepositoryImpl
import com.kt.expressaltitude.domain.usecase.ClearAccessToken
import com.kt.expressaltitude.domain.usecase.GetAccessToken
import com.kt.expressaltitude.domain.usecase.PostDevice
import com.kt.expressaltitude.domain.usecase.SaveAccessToken
import com.kt.expressaltitude.framework.appconfig.AccessTokenDataSourceImpl
import com.kt.expressaltitude.framework.appconfig.TokenLocalDataSourceImpl

class App : Application() {
    lateinit var accessTokenRepository: AccessTokenRepository

    override fun onCreate() {
        super.onCreate()
    }

    fun get(): Application {
        return this
    }


    fun accessToken(): String {
        var token: String = ""

        return token
    }

    fun interactors(accessTokenRepository: AccessTokenRepository): Iteractors {
        return Iteractors(
            ClearAccessToken(accessTokenRepository),
            GetAccessToken(accessTokenRepository),
            PostDevice(accessTokenRepository),
            SaveAccessToken(accessTokenRepository)
        )
    }



}