package com.kt.expressaltitude.presentation.ui.connect

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.appcompat.app.WindowDecorActionBar
import androidx.lifecycle.*
import com.kt.expressaltitude.BuildConfig
import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.Iteractors
import com.kt.expressaltitude.domain.repository.AccessTokenRepository
import com.kt.expressaltitude.domain.repository.AccessTokenRepositoryImpl
import com.kt.expressaltitude.domain.usecase.ClearAccessToken
import com.kt.expressaltitude.domain.usecase.GetAccessToken
import com.kt.expressaltitude.domain.usecase.PostDevice
import com.kt.expressaltitude.domain.usecase.SaveAccessToken
import com.kt.expressaltitude.framework.appconfig.AccessTokenDataSourceImpl
import com.kt.expressaltitude.framework.appconfig.TokenLocalDataSourceImpl
import timber.log.Timber

class ConnectViewModel(
    application: Application,
    private var lifecycleOwner: LifecycleOwner,
    private var context: Context
    ) : AndroidViewModel(application) {

    var enviroment: String? = Constants.ENVIROMENT[0]
    var buildNumber: String
    var btnConnectText: String
    var accessTokenRepository: AccessTokenRepository
    var iteractors: Iteractors
    private var isConnect: Boolean
    lateinit var firstConnect: MutableLiveData<DeviceResponse>
    lateinit var accessTokenDevice: LiveData<DeviceResponse>
    init {
        buildNumber = "${Constants.BUILD_VERSION_CODE}.${Constants.BUILD_VERSION_NAME}"
        btnConnectText = "Connect"
        accessTokenRepository = AccessTokenRepositoryImpl(
            AccessTokenDataSourceImpl.getInstance(enviroment!!),
            TokenLocalDataSourceImpl(context)
        )
        iteractors = Iteractors(
            ClearAccessToken(accessTokenRepository), GetAccessToken(accessTokenRepository),
            PostDevice(accessTokenRepository), SaveAccessToken(accessTokenRepository)
        )
        isConnect = false

    }

    fun connect(): LiveData<DeviceResponse?>  {
        firstConnect = MutableLiveData<DeviceResponse>()
        iteractors.postDevice().observe(lifecycleOwner, Observer {
            it?.let {
                firstConnect.postValue(it)
                
            }

        })
        return iteractors.postDevice()
    }
    fun getAccessToken() {

    }
    fun selectEnviroment() {

    }


}