package com.jonahstarling.jsportfolio.base.Models

object TimelineProjects {

    val TIMELINE_PROJECTS: MutableList<TimelineProject> = ArrayList()
    val TIMELINE_PROJECTS_MAP: MutableMap<String, TimelineProject> = HashMap()

    fun addTimelineProject(timelineProject: TimelineProject) {
        TIMELINE_PROJECTS.add(timelineProject)
        TIMELINE_PROJECTS_MAP[timelineProject.title] = timelineProject
    }

    data class TimelineProject(val title: String) {

    }
}