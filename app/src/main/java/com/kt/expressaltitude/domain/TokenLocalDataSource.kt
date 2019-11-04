package com.kt.expressaltitude.domain

import com.kt.expressaltitude.data.api.model.response.DeviceResponse

interface TokenDataSource {
    fun isAccesTokenExist(): Boolean?
    fun save(token: String)
    fun refresh()
    fun clear()
    fun update(token: String)
}