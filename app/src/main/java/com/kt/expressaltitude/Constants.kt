package com.kt.expressaltitude

object Constants {

    const val REGISTER_DEVICE_PATH = "devices/"
    const val DEVICE_REFRESH_PATH = "devices/refresh"
    const val DEVICE_LOGOUT_PATH = "devices/logout"
    const val REGISTRATION_CARD_PATH = "express-app/"
    const val GUEST_ARRIVAL_PATH = "guest-arrivals/details"
    const val GUEST_DEPARTURE_PATH = "guest-departures/details"
    const val PROPERTY_PUBLIC_PATH = "properties/public?"
    const val PROPERTY_PRIVATE_PATH = "properties/"
    const val WEATHER_PATH = "weather"
    const val REF_COUNTRY_PATH = "countries"
    const val SHARE_PREFERANCE_TOKEN_NAME = "Token"
    const val SHARE_PREFERANCE_CONFIG_NAME = "App Config"
    const val SHARE_PREFERANCE_ENVIROMENT_NAME = "Enviroment"
    const val CONFIG_FILE_NAME = "AppConfig"
    const val BUILD_VERSION_CODE = BuildConfig.VERSION_CODE.toString()
    const val BUILD_VERSION_NAME = BuildConfig.VERSION_NAME

    val ENVIROMENT = arrayOf("UAT / Training", "DEV", "Production / Live")
    var CURRENT_ENVIROMENT = ENVIROMENT[0]
    val DEVICE_BASE_URL = mapOf(
        ENVIROMENT[0] to "https://auth-device.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val CARD_BASE_URL = mapOf(
        ENVIROMENT[0] to "https://card.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val REGISTRATION_CARD_BASE_URL = mapOf(
        ENVIROMENT[0] to "https://express.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val PROPERTY_BASE_URL = mapOf(
        ENVIROMENT[0] to "https://property.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val GUEST_ARRIVALS_BASEURL = mapOf(
        ENVIROMENT[0] to "https://express.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val GUEST_DEPARTURE_BASE_URL = mapOf(
        ENVIROMENT[0] to "https://express.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )
    val REF_DATABASE_URL = mapOf(
        ENVIROMENT[0] to "https://ref.dev.altitudehq.com/",
        ENVIROMENT[1] to "https://api.uat.altitudehq.com/",
        ENVIROMENT[2] to "https://api.altitudehq.com/"
    )

    
}
