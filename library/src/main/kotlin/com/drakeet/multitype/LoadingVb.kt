package com.drakeet.multitype

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

internal class LoadingVb: ItemViewDelegate<Loading?, LoadingVb.ViewHolder>() {
    override fun onCreateViewHolder(context: Context, parent: ViewGroup): ViewHolder = ViewHolder(View(context))
    override fun onBindViewHolder(holder: ViewHolder, item: Loading?) {}
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

internal class Loading: DifferItem() {
    override fun isOtherItemTheSame(other: Any): Boolean = true
    override fun isOtherContentsTheSame(other: Any): Boolean = true
    override fun getChangePayload(newItem: Any): Any? = null
}