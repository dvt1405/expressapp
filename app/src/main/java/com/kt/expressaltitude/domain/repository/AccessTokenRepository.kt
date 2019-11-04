package com.kt.expressaltitude.domain.repository

import androidx.lifecycle.LiveData
import com.kt.expressaltitude.data.api.model.response.DeviceResponse

interface AccessTokenRepository {
    fun saveAccessToken(token: String)
    fun getDeviceStatus(): LiveData<DeviceResponse?>
    fun getAccessToken(id: String): LiveData<DeviceResponse?>
    fun clearToken()
}