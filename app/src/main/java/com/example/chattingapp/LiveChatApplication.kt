package com.example.chattingapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LiveChatApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any libraries or components here
    }
}