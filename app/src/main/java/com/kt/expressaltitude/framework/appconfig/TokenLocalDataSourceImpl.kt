package com.kt.expressaltitude.framework.appconfig

import android.content.Context
import android.content.SharedPreferences
import com.kt.expressaltitude.App
import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.domain.TokenLocalDataSource

class TokenLocalDataSourceImpl private constructor() : TokenLocalDataSource {

    private var refs: SharedPreferences
    private var accessToken: String? = null
    val token: String?
    get() = accessToken
    init {
        refs = App().get()
            .getSharedPreferences(Constants.SHARE_PREFERANCE_TOKEN_NAME, Context.MODE_PRIVATE)
    }

    companion object {
        private var INSTANCE: TokenLocalDataSourceImpl? = null
        fun getInstance(): TokenLocalDataSourceImpl {
            if (INSTANCE == null) {
                INSTANCE = TokenLocalDataSourceImpl()
            }
            return INSTANCE!!
        }
    }


    override fun isAccesTokenExist(): Boolean {
        var check = true
        val token: String? = refs.getString(Constants.SHARE_PREFERANCE_TOKEN_NAME, "")
        if (token.isNullOrEmpty()) {
            check = false
        } else{
            accessToken = token
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