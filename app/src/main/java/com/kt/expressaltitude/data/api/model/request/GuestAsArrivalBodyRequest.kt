package com.kt.expressaltitude.data.api.model.request

class GuestAsArrivalBodyRequest {
    var deviceId: String? =
        "" // “ID of device this guest is assigned to, only one pending guest arrival/departure per device is allowed, use this deviceId to retrieve the Registration Card details”
    var reservationRef: String? = "" //“The ref of the reservation which needs to sign the card”
    var reservationId: String? = "" //“The ID of the reservation which needs to sign the card”

    var type: String? = "" //“standard|group” - one of either only

}