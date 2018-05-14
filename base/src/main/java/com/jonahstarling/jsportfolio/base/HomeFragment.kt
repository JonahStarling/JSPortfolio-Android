package com.jonahstarling.jsportfolio.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jonahstarling.jsportfolio.R
import com.jonahstarling.jsportfolio.base.Models.TimelineYears.TIMELINE_YEARS
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // TODO: inflate view
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        var allYearsString = ""
        for (year in TIMELINE_YEARS) {
            allYearsString += year.toString() + "\n"
        }
        rootView.testTextView.text = allYearsString

        return rootView
    }

}