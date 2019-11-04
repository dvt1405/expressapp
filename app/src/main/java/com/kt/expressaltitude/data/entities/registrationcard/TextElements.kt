package com.kt.expressaltitude.data.entities.registrationcard

import com.google.gson.annotations.SerializedName
import com.kt.expressaltitude.data.utils.RegistrattionCardUtils

class TextElements {
    @SerializedName("startTitle")
    var startTitle = RegistrattionCardUtils.START_TITLE
    var startActionPrompt = RegistrattionCardUtils.START_ACTION_PROMT
    var signingTitle = RegistrattionCardUtils.SIGNING_TITLE
    var details = RegistrattionCardUtils.DETAILS
    var sign = RegistrattionCardUtils.SIGN
    var checkout = RegistrattionCardUtils.CHECKOUT
    var title = RegistrattionCardUtils.TITLE
    var firstName = RegistrattionCardUtils.FIRST_NAME
    var lastName = RegistrattionCardUtils.LAST_NAME
    var emailAddress = RegistrattionCardUtils.EMAIL_ADDRESS
    var phone = RegistrattionCardUtils.PHONE
    var marketing = RegistrattionCardUtils.MARKETING
    var address = RegistrattionCardUtils.ADDRESS
    var termsTitle = RegistrattionCardUtils.TERMS_TITLE
    var privacyTitle = RegistrattionCardUtils.PRIVACY_TITLE
    var submitButton = RegistrattionCardUtils.SUBMIT_BUTTON

}