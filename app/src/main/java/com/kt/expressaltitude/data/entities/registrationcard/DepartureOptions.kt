package com.kt.expressaltitude.data.entities.registrationcard

class DepartureOptions {

    var consentSubscription:Boolean? = true
    var consentRetainInformation:Boolean? = true
    var consentRetainCreditCard:Boolean? = true
    var consentExtMarketing:Boolean = true
    var requestSign: Boolean = true //Request the sign area
    var feedback:Boolean = true
    var feedbackStayRating: String? = ""
}