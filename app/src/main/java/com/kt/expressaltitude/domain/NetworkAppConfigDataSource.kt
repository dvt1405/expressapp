package com.kt.expressaltitude.domain

import androidx.lifecycle.LiveData
import com.kt.expressaltitude.data.entities.registrationcard.RegistrationCard

interface NetworkAppConfigDataSource {
    fun getAppConfig(): LiveData<RegistrationCard>
}