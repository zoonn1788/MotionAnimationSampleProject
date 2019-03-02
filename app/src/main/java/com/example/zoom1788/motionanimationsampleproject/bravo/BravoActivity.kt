package com.example.zoom1788.motionanimationsampleproject.bravo

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.zoom1788.motionanimationsampleproject.R
import com.example.zoom1788.motionanimationsampleproject.alpha.AlphaActivity
import com.example.zoom1788.motionanimationsampleproject.alpha.ChalrieFragment
import com.example.zoom1788.motionanimationsampleproject.bravo.fragment.AlphaFragment
import com.example.zoom1788.motionanimationsampleproject.bravo.fragment.BravoFragment
import kotlinx.android.synthetic.main.activity_bravo.*

class BravoActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.activity_bravo_navigation_alpha -> {
                val intent = Intent(this@BravoActivity, AlphaActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.activity_bravo_navigation_item2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.activity_bravo_fragment_container, AlphaFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.activity_bravo_navigation_item3 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.activity_bravo_fragment_container, BravoFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.activity_bravo_navigation_image -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.activity_bravo_fragment_container, ChalrieFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bravo)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_bravo_fragment_container, AlphaFragment.newInstance())
                .commitNow()
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
