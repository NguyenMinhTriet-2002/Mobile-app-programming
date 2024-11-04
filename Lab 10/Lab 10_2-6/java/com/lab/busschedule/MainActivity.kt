package com.lab.busschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lab.busschedule.ui.BusScheduleApp
import com.lab.busschedule.ui.theme.BusScheduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusScheduleTheme {
                BusScheduleApp()
            }
        }
    }
}
