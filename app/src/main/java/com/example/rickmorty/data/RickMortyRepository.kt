package com.example.rickmorty.data

import com.example.rickmorty.data.models.character_details.CharacterDetails
import com.example.rickmorty.data.models.characters.CharactersResponse

interface RickMortyRepository {
    suspend fun getCharacters(): Result<CharactersResponse>
    suspend fun getCharacterDetails(id: Int): Result<CharacterDetails>
}