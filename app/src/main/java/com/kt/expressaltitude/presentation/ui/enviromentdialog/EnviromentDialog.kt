package com.kt.expressaltitude.presentation.ui.enviromentdialog

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import com.kt.expressaltitude.R

class EnviromentDialog(private val context: Context) {
    var alertDialog: AlertDialog.Builder

    init {
        alertDialog = AlertDialog.Builder(context)
            .setView(
                LayoutInflater.from(context)
                    .inflate(R.layout.enviroment_dialog, null, false)
            ).setCancelable(true)

    }

    fun show() {

    }

    fun hide() {

    }
}