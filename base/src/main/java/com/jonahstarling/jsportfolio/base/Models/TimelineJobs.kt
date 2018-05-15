package com.jonahstarling.jsportfolio.base.Models

import com.jonahstarling.jsportfolio.base.Enums.LanguageStackItem
import com.jonahstarling.jsportfolio.base.Enums.PositionStatus
import com.jonahstarling.jsportfolio.base.Enums.TechnologyPlatform
import com.jonahstarling.jsportfolio.base.Enums.TechnologyStackItem
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

object TimelineJobs {

    val TIMELINE_JOBS: MutableList<TimelineJob> = ArrayList()
    val TIMELINE_JOBS_MAP: MutableMap<String, TimelineJob> = HashMap()

    fun addTimelineJob(timelineJob: TimelineJob) {
        TIMELINE_JOBS.add(timelineJob)
        TIMELINE_JOBS_MAP[timelineJob.id] = timelineJob
    }

    data class TimelineJob(val companyTitle: String, val startDate: Date) {
        val id: String = "$companyTitle-$startDate"
        var positionTitle: String? = null
        var positionStatus: PositionStatus? = null
        var endDate: Date? = null
        var jobDescription: String? = null
        var companyDescription: String? = null
        var platforms: ArrayList<TechnologyPlatform> = ArrayList()
        var technologyStack: ArrayList<TechnologyStackItem> = ArrayList()
        var languageStack: ArrayList<LanguageStackItem> = ArrayList()

        override fun toString(): String {
            return companyTitle + "\n" +
                    startDate + "\n" +
                    endDate + "\n" +
                    positionTitle + "\n" +
                    positionStatus?.text + "\n" +
                    jobDescription + "\n" +
                    companyDescription + "\n" +
                    platforms.toString() + "\n" +
                    technologyStack.toString() + "\n" +
                    languageStack.toString()
        }
    }
}