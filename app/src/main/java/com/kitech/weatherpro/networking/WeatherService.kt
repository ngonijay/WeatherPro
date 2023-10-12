package com.kitech.weatherpro.networking

import com.kitech.weatherpro.data.WeatherToday
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET
    suspend fun getTodayWeather (@Query("lat") lat: Double,
                                  @Query("log") lng: Double,
                                  @Query("appid") appid: String):Response<WeatherToday>

}