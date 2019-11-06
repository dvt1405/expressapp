package com.kt.expressaltitude.presentation.ui.connect

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.R
import com.kt.expressaltitude.databinding.ActivityConnectBinding
import com.kt.expressaltitude.presentation.ui.enviromentdialog.EnviromentDialog
import com.kt.expressaltitude.presentation.ui.enviromentdialog.EnviromentDialogAdapter
import kotlinx.android.synthetic.main.activity_connect.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_connect.btnConnect
import kotlinx.android.synthetic.main.activity_connect.textVersionConnectScreen
import kotlinx.android.synthetic.main.enviroment_dialog.view.*
import java.util.zip.Inflater

class ConnectActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityConnectBinding
    var enviroment: String = Constants.ENVIROMENT[0]
    lateinit var context: Context
    lateinit var connectViewModel: ConnectViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
        context = this
    }

    fun initDataBinding() {
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_connect)
        dataBinding.version = "${Constants.BUILD_VERSION_CODE}.${Constants.BUILD_VERSION_NAME}"
        dataBinding.enviroment = "Settings(${enviroment})"
        connectViewModel = ViewModelProviders.of(this,ConnectViewModelFactory(this,this)).get(ConnectViewModel::class.java)
        dataBinding.progressBar.visibility = View.INVISIBLE
        dataBinding.btnConnect.setOnClickListener {
            connectViewModel.connect().observe(this, Observer {
                dataBinding.connectCode.text = it!!.connectCode
            })
        }

        dataBinding.enviromentSetting.setOnClickListener {
            showDialogEnviroment()
        }
    }

    fun showDialogEnviroment() {
        var alertDialog = AlertDialog.Builder(this)
        var dialogView: View = layoutInflater.inflate(R.layout.enviroment_dialog,null)
        var recyclerViewDialog:RecyclerView = dialogView.findViewById(R.id.recyclerViewDialog)

        recyclerViewDialog.adapter = EnviromentDialogAdapter()
        recyclerViewDialog.layoutManager = LinearLayoutManager(this)
        alertDialog.setView(dialogView)
        alertDialog.create().show()
    }

}
