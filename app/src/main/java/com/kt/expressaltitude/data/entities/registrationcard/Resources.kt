package com.kt.expressaltitude.data.entities.registrationcard

import com.google.gson.annotations.SerializedName

class Resources {
    @SerializedName("id")
    var id: String? = ""

    @SerializedName("language")
    var language: String? = ""

    @SerializedName("value")
    var value: String? = ""

    @SerializedName("code")
    var type: String? = ""

    @SerializedName("name")
    var name: String? = ""

    @SerializedName("description")
    var description: String? = ""

    @SerializedName("fileId")
    var fileId: String? = ""

    @SerializedName("fileUrl")
    var fileUrl: String? = ""

    @SerializedName("createdAt")
    var createdAt: String? = ""

    @SerializedName("createdBy")
    var createdBy: String? = ""

    @SerializedName("modifiedAt")
    var modifiedAt: String? = ""

    @SerializedName("modifiedBy")
    var modifiedBy: String? = ""

}