package com.kt.expressaltitude.data.entities.registrationcard

class Device {
    var id: String? = ""
    var deviceName: String? = ""
    var createdAt: String? = "" //Timestamp of creation
    var createdBy: String? =
        "" //User ID of the user who created this device in the registration card as per user id in JWT

}