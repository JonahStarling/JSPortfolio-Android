package com.jonahstarling.jsportfolio.base.Models

object TimelineEvents {

    val TIMELINE_EVENTS: MutableList<TimelineEvent> = ArrayList()
    val TIMELINE_EVENTS_MAP: MutableMap<String, TimelineEvent> = HashMap()

    fun addTimelineEvent(timelineEvent: TimelineEvent) {
        TIMELINE_EVENTS.add(timelineEvent)
        TIMELINE_EVENTS_MAP[timelineEvent.title] = timelineEvent
    }

    data class TimelineEvent(var title: String) {

    }
}