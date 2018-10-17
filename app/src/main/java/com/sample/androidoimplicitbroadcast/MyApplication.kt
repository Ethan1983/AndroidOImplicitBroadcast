package com.sample.androidoimplicitbroadcast

import android.app.Application
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        IntentFilter().apply {
            addAction( Intent.ACTION_PACKAGE_REPLACED )
            addAction( ConnectivityManager.CONNECTIVITY_ACTION )
        }.also {
            registerReceiver( ImplicitIntentReceiver(), it )
        }

    }

}