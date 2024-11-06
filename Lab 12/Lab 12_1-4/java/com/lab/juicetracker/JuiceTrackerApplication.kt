package com.lab.juicetracker

import android.app.Application
import com.lab.juicetracker.data.AppContainer
import com.lab.juicetracker.data.AppDataContainer

class JuiceTrackerApplication : Application() {
    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
