package com.example.zoom1788.motionanimationsampleproject.alpha

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlphaSimpleAdapter(private val items: List<String>): RecyclerView.Adapter<AlphaSimpleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context).run {
            inflate(android.R.layout.simple_list_item_1, parent, false).let {
                ViewHolder(it)
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(val view: View, private val textView: TextView = view.findViewById(android.R.id.text1)): RecyclerView.ViewHolder(view) {
        var text: CharSequence
            get() = textView.text
            set(value) {
                textView.text = value
            }
    }
}