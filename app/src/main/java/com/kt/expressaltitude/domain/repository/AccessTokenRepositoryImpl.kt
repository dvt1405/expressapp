package com.kt.expressaltitude.domain.repository

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.AccessTokenDataSource
import com.kt.expressaltitude.domain.TokenLocalDataSource

class AccessTokenRepositoryImpl(tokenDataSource: AccessTokenDataSource,
                                localDataSource: TokenLocalDataSource
): AccessTokenRepository {
    private var tokenDataSource: AccessTokenDataSource
    private var localDataSource: TokenLocalDataSource
    init {
        this.tokenDataSource = tokenDataSource
        this.localDataSource = localDataSource
    }
    override fun saveAccessToken(token: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDeviceStatus(): LiveData<DeviceResponse?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAccessToken(id: String): LiveData<DeviceResponse?> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearToken() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}