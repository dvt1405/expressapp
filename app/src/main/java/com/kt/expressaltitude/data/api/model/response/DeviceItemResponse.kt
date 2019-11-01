package com.kt.expressaltitude.data.api.model.response

import com.google.gson.annotations.SerializedName

class DeviceItemResponse {
    @SerializedName("id")
    lateinit var id: String
    @SerializedName("deviceName")
    lateinit var deviceName: String
    @SerializedName("createAt")
    lateinit var createAt: String
    @SerializedName("createdBy")
    lateinit var createdBy: String
}