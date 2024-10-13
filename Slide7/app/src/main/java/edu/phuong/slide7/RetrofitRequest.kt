package edu.phuong.slide7

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitRequest {
   // dinh nghia request foods
    // dinh nghia doi tuong dung de nap duw lieu
    @GET("/foods")
    fun getFoods(): Call<List<Food>>


}