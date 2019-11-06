package com.kt.expressaltitude.domain

import com.kt.expressaltitude.domain.usecase.ClearAccessToken
import com.kt.expressaltitude.domain.usecase.GetAccessToken
import com.kt.expressaltitude.domain.usecase.PostDevice
import com.kt.expressaltitude.domain.usecase.SaveAccessToken

data class Iteractors( val clearAccessToken: ClearAccessToken,
                       val getAccessToken: GetAccessToken,
                       val postDevice: PostDevice,
                       val saveAccessToken: SaveAccessToken) {
}