package com.example.rickmorty.data.network

import com.example.rickmorty.data.models.character_details.CharacterDetails
import com.example.rickmorty.data.models.characters.CharactersResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface RickMortyApiService {
    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("character")
    suspend fun getCharacters(): CharactersResponse


    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("character/{id}")
    suspend fun getCharacterDetail(@Path("id") id: Int): CharacterDetails
}