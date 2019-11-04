package com.kt.expressaltitude.framework.appconfig

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.firebase.iid.FirebaseInstanceId
import com.kt.expressaltitude.App
import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.data.api.APIControl
import com.kt.expressaltitude.data.api.model.request.DeviceRequest
import com.kt.expressaltitude.data.api.model.response.DeviceResponse
import com.kt.expressaltitude.domain.TokenDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import java.sql.Time
import java.util.prefs.Preferences

class TokenDataSourceImpl private constructor() : TokenDataSource {

    private var refs: SharedPreferences

    init {
        refs = App().get()
            .getSharedPreferences(Constants.SHARE_PREFERANCE_TOKEN_NAME, Context.MODE_PRIVATE)
    }

    companion object {
        private var INSTANCE: TokenDataSourceImpl? = null
        fun getInstance(): TokenDataSourceImpl {
            if (INSTANCE == null) {
                INSTANCE = TokenDataSourceImpl()
            }
            return INSTANCE!!
        }
    }


    override fun isAccesTokenExist(): Boolean? {
        var check = true
        val token: String? = refs.getString(Constants.SHARE_PREFERANCE_TOKEN_NAME, "")
        if (token.isNullOrEmpty()) {
            check = false
        }
        return check
    }

    override fun save(token: String) {
        refs.edit()
            .putString(Constants.SHARE_PREFERANCE_TOKEN_NAME, token)
            .apply()
    }

    override fun refresh() {
        //Refresh access token
    }

    override fun clear() {
        refs.edit()
            .clear()
            .apply()
    }

    override fun update(token: String) {
        refs.edit()
            .putString(Constants.SHARE_PREFERANCE_TOKEN_NAME, token)
            .apply()
    }

    
}