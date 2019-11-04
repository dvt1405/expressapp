package com.kt.expressaltitude.domain

interface LocalAppConfigDataSource {
    fun save(appConfig: String, fileName: String)
}