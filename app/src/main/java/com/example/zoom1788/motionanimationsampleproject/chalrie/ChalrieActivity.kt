package com.example.zoom1788.motionanimationsampleproject.chalrie

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.zoom1788.motionanimationsampleproject.R
import kotlinx.android.synthetic.main.activity_chalrie.*

class ChalrieActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.chalrie_navigation_bravo -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.chalrie_navigation_alpha -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chalrie)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
