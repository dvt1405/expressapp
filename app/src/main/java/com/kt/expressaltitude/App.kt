package com.kt.expressaltitude

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    fun get() : Application {
        return this
    }
}