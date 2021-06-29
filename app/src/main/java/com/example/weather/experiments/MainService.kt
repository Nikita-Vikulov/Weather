package com.example.weather.experiments

import android.app.IntentService
import android.content.Intent
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainService(name: String? = "MainService") : IntentService(name) {

    override fun onHandleIntent(intent: Intent?) {
        val intent = Intent("ru.geekbrains.name_of_action")
        intent.putExtra("MSG", "text of message")
        sendBroadcast(intent)
    }

}
