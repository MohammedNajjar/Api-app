package com.example.apiapplication.apiService

import com.example.apiapplication.model.AllService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {


    @GET("services/{id}")
    suspend fun getAllService(@Path("id") id :Int ): AllService

    // singleton object
    companion object{
        var apiService : ApiService? = null
        fun getInstance() : ApiService {
            if(apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl("https://tmkeensa.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}