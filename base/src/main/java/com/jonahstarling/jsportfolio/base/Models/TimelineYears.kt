package com.jonahstarling.jsportfolio.base.Models

object TimelineYears {

    val TIMELINE_YEARS: MutableList<TimelineYear> = ArrayList()
    val TIMELINE_YEARS_MAP: MutableMap<String, TimelineYear> = HashMap()

    fun addTimelineYear(timelineYear: TimelineYear) {
        TIMELINE_YEARS.add(timelineYear)
        TIMELINE_YEARS_MAP[timelineYear.title] = timelineYear
    }

    data class TimelineYear(val title: String) {
        val jobs: ArrayList<TimelineJobs.TimelineJob> = ArrayList()
        val projects: ArrayList<TimelineProjects.TimelineProject> = ArrayList()
        val events: ArrayList<TimelineEvents.TimelineEvent> = ArrayList()

        override fun toString(): String {
            return title + "\n" + jobs.toString() + "\n"
        }
    }
}