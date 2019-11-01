package com.kt.expressaltitude.data.api.model.response

import com.google.gson.annotations.SerializedName

class ResponsePutResource {
    @SerializedName("value")
    lateinit var value: String
    @SerializedName("fileId")
    lateinit var fileID: String
    @SerializedName("fileUrl")
    lateinit var fileUrl: String
}