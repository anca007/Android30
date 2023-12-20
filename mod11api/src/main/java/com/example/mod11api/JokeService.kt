package com.example.mod11api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface JokeService {
    companion object {
        //les instances de moshi et retrofit
        val BASE_URL = "https://api.chucknorris.io/jokes/"

        //permet de transformer le json en objet et inversement
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .build()
    }

    //la listes des end-point
    @GET("random")
    suspend fun getRandomFact(): Joke

    //passage de paramètre
    @GET("joke/{id}")
    suspend fun getJokeById(@Path("id") id: Long): Joke

    //ajout d'un body
    @POST("joke/add")
    suspend fun addJoke(@Body joke: Joke)

    object JokeApi {
        //la création de l'objet retrofitService
        val retrofitService: JokeService by lazy { retrofit.create(JokeService::class.java) }
    }

}