package com.kt.expressaltitude.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.repository.AccessTokenRepository

class PostDevice(private val accessTokenRepository: AccessTokenRepository) {
    operator fun invoke(): LiveData<DeviceResponse?>  {
        Log.e("Post device","running")
        return accessTokenRepository.getDeviceStatus()
    }
}