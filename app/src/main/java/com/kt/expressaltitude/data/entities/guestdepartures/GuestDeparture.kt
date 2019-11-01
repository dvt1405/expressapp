package com.kt.expressaltitude.data.entities.guestdepartures

import com.google.gson.annotations.SerializedName

class GuestDeparture() {
    @SerializedName("")
    var id: String? = ""
    @SerializedName("")
    var accountId: String? = ""
    @SerializedName("")
    var propertyId: String? = "" // Based on propoerty ID in registration card
    @SerializedName("")
    var status: String? = ""
    @SerializedName("")
    var type: String? = ""
    @SerializedName("")
    var reservationRef: String? = ""
    @SerializedName("")
    var reservationId: String? = ""
    @SerializedName("")
    var depatureDate: String? = ""
    @SerializedName("")
    var registrationCardId: String? = ""
    @SerializedName("")
    var deviceId: String? = ""
    @SerializedName("")
    var balance: String? = ""
    @SerializedName("")
    var signImg: String? = ""
    @SerializedName("")
    var createdAt: String? = ""
    @SerializedName("")
    var createdBy: String? = ""
    @SerializedName("")
    var signedAt: String? = "" //Timestamp when it was signed
    @SerializedName("")
    var systemId: String? = "" //kiosk | express

}