package com.kt.expressaltitude.data.api.model.response

import com.google.gson.annotations.SerializedName

class DeviceResponse {
    @SerializedName("id")
    var id: String? = ""
    @SerializedName("uniqueDeviceId")
    var uniqueDeviceId :String?  = ""
    @SerializedName("access_token")
    var access_token: String? = ""
    @SerializedName("connectCode")
    var connectCode:String? = ""
    @SerializedName("status")
    var status :String? = ""
    @SerializedName("expires")
    var expires: Int? = 0
    @SerializedName("description")
    var description : String? = ""
}