package com.example.Nozel.app

import com.example.Nozel.model.RiwayatModel
import com.example.Nozel.model.ResponseModel


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("tblriwayat/save")
    fun saveRiwayat(
        @Body data: RiwayatModel
    ): Call<ResponseModel>

    @GET("riwayat")
    fun getRiwayat(): Call<ResponseModel>
}