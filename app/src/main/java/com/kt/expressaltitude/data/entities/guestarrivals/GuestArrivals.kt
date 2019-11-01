package com.kt.expressaltitude.data.entities.guestarrivals

import com.google.gson.annotations.SerializedName

class GuestArrivals {
    @SerializedName("id")
    val id: String? = ""
    @SerializedName("")
    var accountId: String? = ""
    @SerializedName("propertyId")
    var propertyId: String? = "" //Based on propoerty ID in registration card
    @SerializedName("status")
    var status: String? =
        "" // Pending (when created), signed (when signed), removed (when DELETE operation 13)

    @SerializedName("type")
    var type: String? = "" // standard / group
    @SerializedName("reservationRef")
    var reservationRef: String? =
        "" //The PMS based reservation REF, not the internal ID (not unique)
    @SerializedName("reservationId")
    var reservationId: String? = "" //The internal ID of the ref for later use
    @SerializedName("registrationCardId")
    var registrationCardId: String? =
        "" //Retrieved based on the deviceID and its assigned registrationcardId
    @SerializedName("deviceId")
    var devicedId: String? = ""
    @SerializedName("updatedContact")
    var updateContact: Boolean? =
        false //If the sign submission changed something then mark as ‘true’ else ‘false’
    @SerializedName("signImg")
    var signImg: String? = "" //Base 64 endcode,
    @SerializedName("marketingEmail")
    var marketingEmail: String? = "" //Result of signing
    @SerializedName("consentSubscription")
    var consentSubscription: String? = ""
    @SerializedName("consentRetainInformation")
    var consentRetainInformation: String? = ""
    @SerializedName("consentRetainCreditCard")
    var consentRetainCreditCard: String? = ""
    @SerializedName("consentExtMarketing")
    var consentExtMarketing: String? = ""
    @SerializedName("createdAt")
    var arrivalDate: String? = "" //MMDDYYYY
    @SerializedName("createAt")
    var createAt: String? = ""
    @SerializedName("createBy")
    var createBy: String? = ""
    @SerializedName("'signedAt")
    var signedAt: String? = ""

}