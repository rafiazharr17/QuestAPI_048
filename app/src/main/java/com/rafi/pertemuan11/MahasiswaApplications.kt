package com.rafi.pertemuan11

import android.app.Application
import com.rafi.pertemuan11.di.AppContainer
import com.rafi.pertemuan11.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}