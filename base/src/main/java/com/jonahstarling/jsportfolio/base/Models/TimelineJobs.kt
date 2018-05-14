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

    data class TimelineJob(val companyTitle: String, val startDate: Date) {
        val id: String = "$companyTitle-$startDate"
        val positionTitle: String? = null
        val positionStatus: PositionStatus? = null
        val endDate: Date? = null
        val jobDescription: String? = null
        val companyDescription: String? = null
        val platforms: ArrayList<TechnologyPlatform> = ArrayList()
        val technologyStack: ArrayList<TechnologyStackItem> = ArrayList()
        val languageStack: ArrayList<LanguageStackItem> = ArrayList()
    }
}