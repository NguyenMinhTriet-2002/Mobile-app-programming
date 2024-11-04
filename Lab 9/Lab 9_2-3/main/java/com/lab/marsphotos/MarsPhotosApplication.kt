package com.lab.marsphotos

import android.app.Application
import com.lab.marsphotos.data.AppContainer
import com.lab.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
