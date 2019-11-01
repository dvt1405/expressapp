package com.kt.expressaltitude.data.entities.registrationcard

class ArrivalOptions {

    var title: Boolean? = true //Boolean, enable showing of the title option
    var titleOptions: String? = "" //Title options, e.g. Mr, Mrs, et
    var country: Boolean? = true
    var countryData: List<String?> = ArrayList() //One of: countryApi (UI: PMS Countries) | referenceApi (UI: Default Country List)
    var nationality: Boolean? = true
    var region: Boolean? = false //Boolean, requires country
    var regionData: String? = "" //One of: freeText (UI: Free Text) | referenceApi (UI: Default Region List)
    var postCode: Boolean? = false
    var addressFull: Boolean?= false //Boolean - show full address popup
    var marketingGdprPrompt: Boolean?=false //Boolean - show the marketing prompt popup or not
    var promptImageUrl: String?= ""
    var promptImageFileId: String?= ""
    var consentSubscription: Boolean?=true
    var consentRetainInformation: Boolean?=true
    var consentRetainCreditCard: Boolean?=true
    var consentExtMarketing: Boolean?=true

}