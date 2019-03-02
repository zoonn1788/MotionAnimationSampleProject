package com.example.zoom1788.motionanimationsampleproject.alpha

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoom1788.motionanimationsampleproject.R
import com.example.zoom1788.motionanimationsampleproject.bravo.BravoActivity
import com.example.zoom1788.motionanimationsampleproject.main.MainActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_alpha_traditional.*

class AlphaActivity: AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId) {
            R.id.activity_alpha_navigation_main -> {
                val intent = Intent(this@AlphaActivity, MainActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.activity_alpha_navigation_bravo -> {
                val intent = Intent(this@AlphaActivity, BravoActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }
        return@OnNavigationItemSelectedListener false
    }

    val items = (1..20).map { "Item $it" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)

        recyclerview!!.apply {
            adapter = AlphaSimpleAdapter(items)
            layoutManager = LinearLayoutManager(this@AlphaActivity, RecyclerView.VERTICAL, false)
        }
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        activity_alpha_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}