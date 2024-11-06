package com.lab.waterme

import android.app.Application
import com.lab.waterme.data.AppContainer
import com.lab.waterme.data.DefaultAppContainer

class WaterMeApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}
