package com.kt.expressaltitude.data.entities.guestdepartures

class AppResources {
    var id: String?=""
    var code: String?="" //Internal app ID of field
    var name: String?=""
    var type: String?="" //image, text
    var description: String?="" //description of where this resource is used
    var defaults: List<DefaultAppResources>? = null
    var createdAt: String?=""
    var createdBy: String?=""
    var modifiedAt: String?=""
    var modifiedBy: String?=""
}