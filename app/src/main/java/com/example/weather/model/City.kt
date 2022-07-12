package com.example.weather.model

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class City(
    val city: String,
    val lat: Double,
    val lon: Double
) : Parcelable