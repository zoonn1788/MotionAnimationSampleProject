package com.example.zoom1788.motionanimationsampleproject.bravo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zoom1788.motionanimationsampleproject.R

class AlphaFragment: Fragment() {
    companion object {
        fun newInstance(): AlphaFragment =
            AlphaFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.bravo_fragment_alpha, container, false)
        return view
    }
}