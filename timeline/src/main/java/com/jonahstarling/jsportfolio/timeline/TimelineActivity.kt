package com.jonahstarling.jsportfolio.timeline

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TimelineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)
        if (savedInstanceState == null) {
            val fragment = TimelineFragment()
            supportFragmentManager.beginTransaction().add(R.id.activity_timeline_container, fragment).commit()
        }
    }

}
