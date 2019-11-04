package com.kt.expressaltitude.domain

interface AppConfigDataSource {
    fun save(appConfig: String, fileName: String)
}