package com.example.mod11api

import com.squareup.moshi.Json

data class Joke(
    val id : String,
    @Json(name = "icon_url")
    val image : String,
    val value : String
)
