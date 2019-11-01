package com.kt.expressaltitude.data.api

import com.google.gson.GsonBuilder
import com.kt.expressaltitude.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIControl(env: String) {
    var env: String
    lateinit var propertyAPI: API
    lateinit var registrationCardAPI: API
    lateinit var deviceAuthAPI: API
    lateinit var guestArrivalAPI: API
    lateinit var departureAPI: API

    init {
        this.env = env
    }

    companion object {
        var INSTANCE: APIControl? = null
        fun getInstance(env: String): APIControl {
            if (INSTANCE != null) {
                INSTANCE = APIControl(env)
                INSTANCE?.let {
                    it.buildDepartureAPI()
                    it.buildDeviceAuthAPI()
                    it.buildGuestArrivalAPI()
                    it.buildPropertyAPI()
                    it.buildRegistrationCardAPI()
                }
            }
            return INSTANCE!!
        }
    }

    private fun buildRegistrationCardAPI(): API {
        val interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor {
            var newRequest = it.request()
                .newBuilder()
                .addHeader("", "")
                .build()
            it.proceed(newRequest)
        }.addInterceptor(interceptor).build()
        val gson = GsonBuilder().create()
        registrationCardAPI = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.REGISTRATION_CARD_BASE_URL[env])
            .build()
            .create(API::class.java)
        return registrationCardAPI
    }

    private fun buildDeviceAuthAPI(): API {
        val interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor {
            var newRequest = it.request()
                .newBuilder()
                .addHeader("", "")
                .build()
            it.proceed(newRequest)
        }.addInterceptor(interceptor).build()
        val gson = GsonBuilder().create()
        deviceAuthAPI = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.DEVICE_BASE_URL[env])
            .build()
            .create(API::class.java)
        return deviceAuthAPI
    }

    private fun buildGuestArrivalAPI(): API {
        val interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor {
            var newRequest = it.request()
                .newBuilder()
                .addHeader("", "")
                .build()
            it.proceed(newRequest)
        }.addInterceptor(interceptor).build()
        val gson = GsonBuilder().create()
        guestArrivalAPI = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.GUEST_ARRIVALS_BASEURL[env])
            .build()
            .create(API::class.java)
        return guestArrivalAPI
    }

    private fun buildDepartureAPI(): API {
        val interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor {
            var newRequest = it.request()
                .newBuilder()
                .addHeader("", "")
                .build()
            it.proceed(newRequest)
        }.addInterceptor(interceptor).build()
        val gson = GsonBuilder().create()
        departureAPI = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.GUEST_DEPARTURE_BASE_URL[env])
            .build()
            .create(API::class.java)
        return departureAPI
    }

    private fun buildPropertyAPI(): API {
        val interceptor = HttpLoggingInterceptor()
        var client = OkHttpClient.Builder().addInterceptor {
            var newRequest = it.request()
                .newBuilder()
                .addHeader("", "")
                .build()
            it.proceed(newRequest)
        }.addInterceptor(interceptor).build()
        val gson = GsonBuilder().create()
        propertyAPI = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.PROPERTY_BASE_URL[env])
            .build()
            .create(API::class.java)
        return propertyAPI
    }

}