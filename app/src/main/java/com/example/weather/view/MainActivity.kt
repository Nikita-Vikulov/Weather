package com.example.weather.view

import android.os.Bundle
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.example.weather.R
import com.example.weather.databinding.MainActivityBinding.inflate
import com.example.weather.databinding.MainFragmentBinding.inflate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}

