package com.kt.expressaltitude.domain.repository

import android.os.Handler
import android.os.ProxyFileDescriptorCallback
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.AccessTokenDataSource
import com.kt.expressaltitude.domain.TokenLocalDataSource

class AccessTokenRepositoryImpl(
    tokenDataSource: AccessTokenDataSource,
    localDataSource: TokenLocalDataSource
) : AccessTokenRepository {
    private var tokenDataSource: AccessTokenDataSource
    private var localDataSource: TokenLocalDataSource

    init {
        this.tokenDataSource = tokenDataSource
        this.localDataSource = localDataSource
    }

    override fun saveAccessToken(token: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDeviceStatus(): LiveData<DeviceResponse?> = tokenDataSource.postDevice()

    override fun getAccessToken(id: String): LiveData<String> {
        var livedata = MutableLiveData<String>()
        if (localDataSource.isAccesTokenExist()) {
            livedata.value = localDataSource.getAccessToken()
        } else {
            Handler().postDelayed(Runnable {


            }, 1000)
        }
        return livedata
    }

    override fun clearToken() = localDataSource.clear()

    interface HandleRequestToken {
        fun requestTimeout(): String
        fun updateUI()
    }
}