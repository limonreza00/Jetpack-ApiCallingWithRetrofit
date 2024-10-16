package com.coderscastle.jetpack_apicallingwithretrofit

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
   fun getPost(): Call<List<Post>>

}