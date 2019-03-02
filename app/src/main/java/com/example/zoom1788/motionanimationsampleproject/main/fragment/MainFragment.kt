package com.example.zoom1788.motionanimationsampleproject.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoom1788.motionanimationsampleproject.R
import kotlinx.android.synthetic.main.fragment_main_traditional.*

class MainFragment: Fragment() {

    private val items = (1..20).map { "Item$it" }

    companion object {
        val TAG = MainFragment::class.java.simpleName

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.main_recyclerview)

        recyclerView.apply {
            adapter = MainFragmentListAdapter(items)
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        val activity = activity as AppCompatActivity
        activity.setSupportActionBar(main_toolbar)
        activity.supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}