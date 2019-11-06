package com.kt.expressaltitude.data.api.model.request

import android.os.Build
import com.kt.expressaltitude.data.utils.Permissions

class DeviceRequest(uniqueDeviceId: String) {
    var uniqueDeviceId: String
    var device: String
    var os: String
    var systemId: String
    var permissions: Array<String>
    var subscribedTo: Array<String>

    init {
        this.uniqueDeviceId = uniqueDeviceId
        this.device = Build.DEVICE
        this.os = "Android " + Build.VERSION.SDK_INT
        this.systemId = "displayApp"
        this.permissions = arrayOf(
            Permissions.CREATE_GUEST_ARRIVALS,
            Permissions.KIOSK_MODE,
            Permissions.READ_GUEST_ARRIVALS,
            Permissions.SIGN_GUEST_ARRIVALS
        )
        this.subscribedTo = arrayOf("data1", "data2")
    }
}