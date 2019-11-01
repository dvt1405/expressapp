package com.kt.expressaltitude.data.entities.registrationcard

import com.google.gson.annotations.SerializedName

class Style() {
    @SerializedName("template")
    var template: String? = ""

    @SerializedName("logoUrl")
    var logoUrl: String? = ""

    @SerializedName("logoFileId")
    var logoFileId: String? = ""

    @SerializedName("startBgColour")
    var startBgColour: String? = ""

    @SerializedName("startHighlightColour")
    var startHighlightColour: String? = ""

    @SerializedName("startTextColour")
    var startTextColour: String? = ""

    @SerializedName("startHeadingTextColour")
    var startHeadingColour: String? = ""

    @SerializedName("formBgColour")
    var formBgColour: String? = "" //Upper half of form

    @SerializedName("formHighlightColour")
    var formHighlightColour: String? = "" //Form highlight colours (on selection)

    @SerializedName("formTextColour")
    var formTextColour: String? = "" // Colour of form titles and terms text

    @SerializedName("")
    var formHeadingColour: String? =""

    @SerializedName("formHeadingTextColour")
    var formHeadingTextColour: String? = ""

    @SerializedName("formButtonTextColour")
    var formButtonTextColour: String? = "" //Colour of text in button and in date box

    @SerializedName("formBgLowerColour")
    var formBgLowerColour: String? = "" //Lower half of app form screen

    @SerializedName("formButtonColour")
    var formButtonColour: String? = "" //Colour of button and in date box

    @SerializedName("formSigningAreaColour")
    var formSigningAreaColour: String? = ""

    @SerializedName("formSwitchColour")
    var formSwitchColour: String? =""

    @SerializedName("formTabHighlight")
    var formTabHighlight: String? = "" //Tab highlights in form  => duplicated with formHighlightColour?

    @SerializedName("formText")
    var formTextBgColour: String? = ""

    @SerializedName("backArrowColour")
    var backArrowColour: String? = ""

    @SerializedName("radius")
    var radius: String? = "Options: none, small, medium, large"
}