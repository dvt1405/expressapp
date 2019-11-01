package com.kt.expressaltitude.data.api.model.response

import com.google.gson.annotations.SerializedName

class GuestDepartureResponse {
    @SerializedName("id")
    var id: String? = ""

    @SerializedName("reservationId")
    var reservationId: String? = ""

    @SerializedName("reservationRef")
    var reservationRef: String? = ""

    @SerializedName("arrivalDate")
    var arrivalDate: String? = ""

    @SerializedName("departureDate")
    var departureDate: String? = ""

    @SerializedName("roomType")
    var roomType: String? = ""

    @SerializedName("title")
    var title: String? = ""

    @SerializedName("firstName")
    var firstName: String? = ""

    @SerializedName("lastName")
    var lastName: String? = ""

    @SerializedName("phone")
    var phone: String? = ""

    @SerializedName("email")
    var email: String? = ""

    @SerializedName("nationality")
    var nationality: String? = ""

    @SerializedName("countryCode")
    var countryCode: String? = ""

    @SerializedName("country")
    var country: String? = ""

    @SerializedName("subscribed")
    var subscribed: String? = ""

    @SerializedName("stateRegion")
    var stateRegion: String? = ""

    @SerializedName("retainInformation")
    var retainInformation: Boolean? = true

    @SerializedName("retainCreditCard")
    var retainCreditCard: Boolean? = false

    @SerializedName("extMarketing")
    var extMarketing: Boolean? = false

    @SerializedName("address1")
    var address1: String? = ""

    @SerializedName("address2")
    var address2: String? = ""

    @SerializedName("address3")
    var address3: String? = ""

    @SerializedName("address4")
    var address4: String? = ""

    @SerializedName("postcode")
    var postcode: String? = ""

    @SerializedName("reservationToken")
    var reservationToken: String? = ""
}