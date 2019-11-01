package com.kt.expressaltitude.data.entities.registrationcard

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class RegistrationCard {
    @SerializedName("id")
    var id: String? = ""

    @SerializedName("")
    var accountId: String? = ""

    @SerializedName("propertyId")
    var propertyId: String? = ""
    @SerializedName("name")
    var name: String? = ""

    @SerializedName("language")
    var language: List<String>? = null

    @SerializedName("status")
    var status: String? = "" // active, removed

    @SerializedName("")
    var display: Display? = null

    @SerializedName("style")
    var style: Style?= null

    @SerializedName("startPromotionalImage")
    var startPromotionalImage: String? = ""

    @SerializedName("startPromotionalImageFileId")
    var startPromotionalImageFileId: String? = ""

    @SerializedName("promotionalImage")
    var promotionalImage: String? = ""

    @SerializedName("promotionalImageFileId")
    var promotionalImageFileId: String? = ""

    @SerializedName("")
    var arrivalOptions: ArrivalOptions? = null

    @SerializedName("")
    var departureOptions: DepartureOptions? = null

    @SerializedName("devices")
    var device: List<Device> ?= null

    @SerializedName("")
    var createdAt: String? = null

    @SerializedName("")
    var createdBy: String? = null

    @SerializedName("")
    var modifiedAt: String? = null

    @SerializedName("")
    var modifiedBy: String? = null

    @SerializedName("resources")
    var resources: List<Resources> ? = ArrayList()

}