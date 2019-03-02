package com.example.zoom1788.motionanimationsampleproject.main.fragment

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainFragmentViewHolder(private val view: View, private val textView: TextView = view.findViewById(android.R.id.text1)): RecyclerView.ViewHolder(view) {

    var title: CharSequence
        get() = textView.text
        set(value) {
        textView.text = value
        }
}