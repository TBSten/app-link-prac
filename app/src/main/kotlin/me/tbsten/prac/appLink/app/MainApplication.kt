package me.tbsten.prac.appLink.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import me.tbsten.prac.appLink.common.initLogger

@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initLogger()
    }
}
