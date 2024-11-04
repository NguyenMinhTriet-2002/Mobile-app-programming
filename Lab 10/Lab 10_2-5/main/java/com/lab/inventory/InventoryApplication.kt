package com.lab.inventory

import android.app.Application
import com.lab.inventory.data.AppContainer
import com.lab.inventory.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
