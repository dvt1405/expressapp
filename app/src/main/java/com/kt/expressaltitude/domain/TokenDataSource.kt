package com.kt.expressaltitude.domain

interface TokenDataSource {
    fun check()
    fun save(token: String)
    fun refresh()
    fun clear()
    fun update()

}