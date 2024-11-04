package com.lab.busschedule

import android.app.Application
import com.lab.busschedule.data.AppDatabase

class BusScheduleApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
