package com.example.rickmorty.data.models.character_details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Location(
    val name: String?,
    val url: String?
)