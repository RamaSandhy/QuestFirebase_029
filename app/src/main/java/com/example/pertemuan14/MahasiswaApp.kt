package com.example.pertemuan14

import android.app.Application
import com.example.pertemuan14.di.AppContainer
import com.example.pertemuan14.di.MahasiswaContainer

class MahasiswaApp: Application() {
    lateinit var container: MahasiswaContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}