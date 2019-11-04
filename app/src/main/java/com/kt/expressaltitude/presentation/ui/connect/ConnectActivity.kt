package com.kt.expressaltitude.presentation.ui.connect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.kt.expressaltitude.R
import kotlinx.android.synthetic.main.activity_main.*

class ConnectActivity : AppCompatActivity() {
    var viewModel: ConnectViewModel = ViewModelProviders.of(this).get(ConnectViewModel::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)
        btnConnect.setOnClickListener {

        }
    }
}
