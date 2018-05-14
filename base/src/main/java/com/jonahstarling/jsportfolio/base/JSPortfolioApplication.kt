package com.jonahstarling.jsportfolio.base

import android.app.Application
import android.util.Log
import com.jonahstarling.jsportfolio.base.Models.TimelineJobs
import com.jonahstarling.jsportfolio.base.Models.TimelineYears
import java.util.*

class JSPortfolioApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d("onCreate", "JSPortfolioApplication")

        // Timeline Years
        val year2018 = TimelineYears.TimelineYear("2018")
        val year2017 = TimelineYears.TimelineYear("2017")
        val year2016 = TimelineYears.TimelineYear("2016")
        val year2015 = TimelineYears.TimelineYear("2015")
        val year2014 = TimelineYears.TimelineYear("2014")
        val year2013 = TimelineYears.TimelineYear("2013")

        // Timeline Jobs
        val legitApps2GregorianCalendar = GregorianCalendar(2018, 4, 23) // TODO: Check Date
        val legitApps2StartDate = Date(legitApps2GregorianCalendar.timeInMillis)
        val legitApps2 = TimelineJobs.TimelineJob("Legit Apps", legitApps2StartDate)

        val foojiGregorianCalendar = GregorianCalendar(2017, 9, 1) // TODO: Check Date
        val foojiStartDate = Date(foojiGregorianCalendar.timeInMillis)
        val fooji = TimelineJobs.TimelineJob("Legit Apps", foojiStartDate)

        val legitAppsGregorianCalendar = GregorianCalendar(2016, 2, 1) // TODO: Check Date
        val legitAppsStartDate = Date(legitAppsGregorianCalendar.timeInMillis)
        val legitApps = TimelineJobs.TimelineJob("Legit Apps", legitAppsStartDate)

        // Timeline Projects


        // Timeline Events


        // Adding Objects to Timeline Years
        year2018.jobs.add(legitApps2)
        TimelineYears.addTimelineYear(year2018)

        year2017.jobs.add(fooji)
        TimelineYears.addTimelineYear(year2017)

        year2016.jobs.add(legitApps)
        TimelineYears.addTimelineYear(year2016)
    }

}