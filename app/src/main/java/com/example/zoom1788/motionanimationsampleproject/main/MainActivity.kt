package com.example.zoom1788.motionanimationsampleproject.main

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoom1788.motionanimationsampleproject.R
import com.example.zoom1788.motionanimationsampleproject.alpha.AlphaActivity
import com.example.zoom1788.motionanimationsampleproject.main.fragment.AlphaFragment
import com.example.zoom1788.motionanimationsampleproject.main.fragment.BravoFragment
import com.example.zoom1788.motionanimationsampleproject.main.fragment.ChalrieFragment
import com.example.zoom1788.motionanimationsampleproject.main.fragment.MainFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_container.*
import kotlinx.android.synthetic.main.activity_main_traditional.*

class MainActivity : AppCompatActivity() {
    private val items = (1..20).map {
        "item $it"
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, MainFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, AlphaFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, BravoFragment.newInstace())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_button_and_text -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, ChalrieFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_alpha -> {
                val intent = Intent(this, AlphaActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_container)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, MainFragment.newInstance())
                .commit()
        }
        /*
        val list = findViewById<RecyclerView>(R.id.recyclerview)

        list.apply {
            adapter = SimpleAdapter(items)
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        }

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)*/
        main_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}
