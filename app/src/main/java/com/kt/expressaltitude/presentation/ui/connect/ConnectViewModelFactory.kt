package com.kt.expressaltitude.presentation.ui.connect

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kt.expressaltitude.App
import com.kt.expressaltitude.domain.Iteractors
import com.kt.expressaltitude.domain.usecase.ClearAccessToken

class ConnectViewModelFactory(private var lifecycleOwner: LifecycleOwner,private var context: Context): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ConnectViewModel(App().get(),lifecycleOwner = lifecycleOwner,context = context ) as T
    }
}