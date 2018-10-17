package com.sample.androidoimplicitbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ImplicitIntentReceiver : BroadcastReceiver() {

    override fun onReceive( context : Context, intent: Intent ) {

        Log.d( TAG, "onReceiver ${intent.action}" )

    }

    companion object {
        private const val TAG = "ImplicitIntentReceiver"
    }
}