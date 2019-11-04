package com.kt.expressaltitude.domain

import androidx.lifecycle.LiveData
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import java.sql.Time

interface AccessTokenDataSource {
    fun postDevice(): LiveData<DeviceResponse?>
    fun getAccessToken(id: String, timeout: Int): LiveData<DeviceResponse?>
    fun refreshAccessToken()
}