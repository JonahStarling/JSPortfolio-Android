package com.jonahstarling.jsportfolio.timeline

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.jonahstarling.jsportfolio.base.Models.TimelineYears
import kotlinx.android.synthetic.main.fragment_timeline.view.*

class TimelineFragment : Fragment() {

    val layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
//    lateinit var timelineAdapter: TimelineAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // TODO: inflate view
        val rootView: View = inflater.inflate(R.layout.fragment_timeline, container, false)
        rootView.timeline_recycler.layoutManager = layoutManager
        val years = ArrayList<TimelineYears.TimelineYear>()


//        rootView.timeline_recycler.adapter = timelineAdapter
        return rootView
    }

}