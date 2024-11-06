package com.lab.bluromatic

import android.app.Application
import com.lab.bluromatic.data.AppContainer
import com.lab.bluromatic.data.DefaultAppContainer

class BluromaticApplication : Application()  {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}
