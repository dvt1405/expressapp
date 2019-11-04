package com.kt.expressaltitude.framework.appconfig

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.iid.FirebaseInstanceId
import com.kt.expressaltitude.data.api.APIControl
import com.kt.expressaltitude.data.api.model.request.DeviceRequest
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.AccessTokenDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class AccessTokenDataSourceImpl private constructor(enviroment: String) : AccessTokenDataSource {
    private var env: String

    init {
        env = enviroment
    }

    companion object {
        private var INSTANCE: AccessTokenDataSource? = null
        fun getInstance(enviroment: String): AccessTokenDataSource {
            if (INSTANCE == null) {
                INSTANCE = AccessTokenDataSourceImpl(enviroment)
            }
            return INSTANCE!!
        }
    }

    override fun refreshAccessToken() {

    }

    override fun postDevice(): LiveData<DeviceResponse?> {
        var deviceLiveData = MutableLiveData<DeviceResponse?>()
        FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener {
            if (!it.isSuccessful) return@addOnCompleteListener
            val instanceResult = it.result
            if (instanceResult == null) return@addOnCompleteListener
            val uniqueId = instanceResult!!.token
            APIControl.getInstance(env = env).deviceAuthAPI
                .postDevice(DeviceRequest(uniqueId))
                .enqueue(object : Callback<DeviceResponse> {
                    override fun onFailure(call: Call<DeviceResponse>, t: Throwable) {
                        Timber.e(t)
                    }

                    override fun onResponse(
                        call: Call<DeviceResponse>,
                        response: Response<DeviceResponse>
                    ) {
                        response.body()?.let {
                            deviceLiveData.postValue(response.body())
                        }

                    }

                })
        }
        return deviceLiveData
    }

    override fun getAccessToken(id: String, timeout: Int): LiveData<DeviceResponse?> {
        var deviceLiveData = MutableLiveData<DeviceResponse?>()
        APIControl.getInstance(env).deviceAuthAPI.getDeviceAccessToken(id)
            .enqueue(object : Callback<DeviceResponse> {
                override fun onFailure(call: Call<DeviceResponse>, t: Throwable) {
                    
                }

                override fun onResponse(
                    call: Call<DeviceResponse>,
                    response: Response<DeviceResponse>
                ) {
                    var deviceResponse: DeviceResponse? = response.body()

                    deviceResponse?.let {
                        deviceLiveData.postValue(it)
                    }
                }

            })
        return deviceLiveData
    }
}