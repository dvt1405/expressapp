package com.kt.expressaltitude.domain

import com.kt.expressaltitude.domain.usecase.ClearAccessToken
import com.kt.expressaltitude.domain.usecase.GetAccessToken
import com.kt.expressaltitude.domain.usecase.PostDevice
import com.kt.expressaltitude.domain.usecase.SaveAccessToken

data class Iteractors(private val clearAccessToken: ClearAccessToken,
                      private val getAccessToken: GetAccessToken,
                      private val postDevice: PostDevice,
                      private val saveAccessToken: SaveAccessToken) {
}