package com.kt.expressaltitude.presentation.ui.enviromentdialog

import android.content.Context
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.R
import timber.log.Timber

class EnviromentDialogAdapter :
    RecyclerView.Adapter<EnviromentDialogAdapter.EnviromentViewHolder>() {
    var data: Array<String>
    lateinit var context: Context
    init {
        data = Constants.ENVIROMENT
        Timber.e("Size".plus(data.size.toString()))
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnviromentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.enviroment_dialog_item, parent, false)
        Timber.e("createView Holder")
        context = parent.context
        return EnviromentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: EnviromentViewHolder, position: Int) {
        holder.textView.text = data[position]
        holder.textView.setOnClickListener {
            context.getSharedPreferences("ENV",0).edit().putString("env",data[position]).apply()
        }
    }

    class EnviromentViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        var textView: TextView
        init {
            textView = view.findViewById(R.id.idTextViewItemDialog)
        }
        fun bindData(st:String) {
            textView.text = st
            textView.setOnClickListener {
                Constants.CURRENT_ENVIROMENT = st
            }
        }
    }
}