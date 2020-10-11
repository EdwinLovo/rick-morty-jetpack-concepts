package com.example.rickmorty.data.network

import com.example.rickmorty.data.Result
import com.example.rickmorty.data.models.character_details.CharacterDetails
import com.example.rickmorty.data.models.characters.CharactersResponse

interface RickMortyDataSource {
    suspend fun getCharacters(): Result<CharactersResponse>

    suspend fun getCharacterDetails(id: Int): Result<CharacterDetails>
}