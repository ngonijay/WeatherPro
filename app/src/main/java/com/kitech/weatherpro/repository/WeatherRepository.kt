package com.kitech.weatherpro.repository

import android.content.Context
import com.kitech.weatherpro.data.WeatherToday
import com.kitech.weatherpro.networking.ApiManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

class WeatherRepository(private val context: Context) {
    fun getWeatherToday(): Flow<Response<WeatherToday>> = flow {

        emit(
                ApiManager.weatherService.getTodayWeather(-17.7835171,31.0795714,"298ed81ed1a2f5009b38c4cc57a166c5")
        )

    }.flowOn(Dispatchers.IO)

}