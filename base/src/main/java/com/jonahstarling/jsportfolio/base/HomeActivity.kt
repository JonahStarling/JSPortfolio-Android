package com.jonahstarling.jsportfolio.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jonahstarling.jsportfolio.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        if (savedInstanceState == null) {
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction().add(R.id.activity_home_container, fragment).commit()
        }
    }

}
