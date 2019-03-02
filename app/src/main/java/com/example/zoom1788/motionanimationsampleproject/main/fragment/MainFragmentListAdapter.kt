package com.example.zoom1788.motionanimationsampleproject.main.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainFragmentListAdapter(private val items: List<String>): RecyclerView.Adapter<MainFragmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFragmentViewHolder {
        return LayoutInflater.from(parent.context).run {
            inflate(android.R.layout.simple_list_item_1, parent, false).let {
                MainFragmentViewHolder(it)
            }
        }
    }

    override fun onBindViewHolder(holder: MainFragmentViewHolder, position: Int) {
        holder.title = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}