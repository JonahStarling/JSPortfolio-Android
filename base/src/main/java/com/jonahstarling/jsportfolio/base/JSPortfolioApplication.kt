package com.jonahstarling.jsportfolio.base

import android.app.Application
import android.util.Log
import com.jonahstarling.jsportfolio.base.Enums.LanguageStackItem
import com.jonahstarling.jsportfolio.base.Enums.PositionStatus
import com.jonahstarling.jsportfolio.base.Enums.TechnologyPlatform
import com.jonahstarling.jsportfolio.base.Enums.TechnologyStackItem
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
        val legitApps2 = TimelineJobs.TimelineJob("Legit Apps", GregorianCalendar(2018, 4, 30).time)
        legitApps2.positionTitle = "Lead Android Developer"
        legitApps2.positionStatus = PositionStatus.FULL_TIME
        legitApps2.jobDescription = "Worked as the Android Developer for an event app company geared towards K-12 Schools, Universities, Music Festivals, and Conferences. The app is built in an abstracted way that allows for an API endpoint to be passed to it and the app will build itself out."
        legitApps2.companyDescription = "Legit Apps builds custom mobile apps for K-12 schools to help increase engagement and streamline communication between teachers, students, and parents. Legit Apps also builds custom apps for Colleges, Conferences, and Festivals."
        legitApps2.platforms.add(TechnologyPlatform.ANDROID)
        legitApps2.technologyStack.addAll(Arrays.asList(TechnologyStackItem.PICASSO, TechnologyStackItem.REALM))
        legitApps2.languageStack.addAll(Arrays.asList(LanguageStackItem.JAVA, LanguageStackItem.XML))
        TimelineJobs.addTimelineJob(legitApps2)

        val fooji = TimelineJobs.TimelineJob("Legit Apps", GregorianCalendar(2017, 10, 1).time)
        fooji.positionTitle = "Lead Android Developer"
        fooji.positionStatus = PositionStatus.FULL_TIME
        fooji.endDate = GregorianCalendar(2018, 4, 30).time
        fooji.jobDescription = "Worked as the lead android developer. Responsibilities included developing the Android app from scratch to match the design docs and the iOS app. The app allows users to participate in campaigns that Fooji runs so users can get a free experience or product from other big name brands."
        fooji.companyDescription = "Fan experiences. Delivered. Fooji's experiential marketing platform brings together social and chat networks with on-demand delivery services, allowing big brands to start a fan interaction online and finish it offline with an instant physical delivery."
        fooji.platforms.add(TechnologyPlatform.ANDROID)
        fooji.technologyStack.addAll(Arrays.asList(TechnologyStackItem.APOLLO, TechnologyStackItem.GRAPHQL, TechnologyStackItem.GRAPHQL, TechnologyStackItem.OKHTTP, TechnologyStackItem.PICASSO))
        fooji.languageStack.addAll(Arrays.asList(LanguageStackItem.KOTLIN, LanguageStackItem.JAVA, LanguageStackItem.XML))
        TimelineJobs.addTimelineJob(fooji)

        val legitApps = TimelineJobs.TimelineJob("Legit Apps", GregorianCalendar(2016, 2, 1).time)
        legitApps.positionTitle = "Lead iOS and Android Developer"
        legitApps.positionStatus = PositionStatus.FULL_TIME
        legitApps.endDate = GregorianCalendar(2016, 8, 30).time
        legitApps.jobDescription = "Worked as the Head iOS and Android Developer. Responsibilities included working part time during the school year and full time during the summer. I was solely responsible for creating an event app that is used by about 100 different Universities, Music Festivals, and Conferences with close to 250,000 end users."
        legitApps.companyDescription = "Legit Apps main focus is on building custom mobile apps for K-12 schools to help increase engagement and streamline communication between teachers, students, and parents. Legit Apps also builds custom apps for Colleges, Conferences, and Festivals."
        legitApps.platforms.addAll(Arrays.asList(TechnologyPlatform.ANDROID, TechnologyPlatform.IOS))
        legitApps.technologyStack.addAll(Arrays.asList(TechnologyStackItem.PICASSO, TechnologyStackItem.REALM, TechnologyStackItem.KINGFISHER))
        legitApps.languageStack.addAll(Arrays.asList(LanguageStackItem.JAVA, LanguageStackItem.XML, LanguageStackItem.SWIFT))
        TimelineJobs.addTimelineJob(legitApps)

        val gsa = TimelineJobs.TimelineJob("Google Student Ambassador", Date(GregorianCalendar(2015, 8, 1).timeInMillis))
        gsa.positionTitle = "Student Ambassador"
        gsa.positionStatus = PositionStatus.PART_TIME
        gsa.endDate = GregorianCalendar(2016, 5, 30).time
        gsa.jobDescription = "Chosen to serve as a liaison between the University of Kentucky and Google. My job is to promote Google’s products, initiatives, and to provide support and information to students, faculty, and staff."
        gsa.companyDescription = "Google... I don't think they need a description."
        TimelineJobs.addTimelineJob(gsa)

        // Timeline Projects


        // Timeline Events


        // Adding Objects to Timeline Years
        year2018.jobs.add(legitApps2)
        TimelineYears.addTimelineYear(year2018)

        year2017.jobs.add(fooji)
        TimelineYears.addTimelineYear(year2017)

        year2016.jobs.add(legitApps)
        TimelineYears.addTimelineYear(year2016)

        year2015.jobs.add(gsa)
        TimelineYears.addTimelineYear(year2015)

        TimelineYears.addTimelineYear(year2014)

        TimelineYears.addTimelineYear(year2013)
    }

}