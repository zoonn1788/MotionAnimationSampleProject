package com.example.zoom1788.motionanimationsampleproject.alpha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zoom1788.motionanimationsampleproject.R

class ChalrieFragment: Fragment() {
    companion object {
        fun newInstance(): ChalrieFragment =
            ChalrieFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.bravo_fragment_chalrie, container, false)
        return view
    }
}