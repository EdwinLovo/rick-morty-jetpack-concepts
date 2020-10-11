package com.example.rickmorty.data.network

import com.example.rickmorty.data.Result
import com.example.rickmorty.data.models.character_details.CharacterDetails
import com.example.rickmorty.data.models.characters.CharactersResponse

class RemoteRickMortyDataSource(private val apiService: RickMortyApiService) : RickMortyDataSource {

    override suspend fun getCharacters(): Result<CharactersResponse> {
        return try {
            val charactersResponse = apiService.getCharacters()
            Result.Success(charactersResponse)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun getCharacterDetails(id: Int): Result<CharacterDetails> {
        return try {
            val characterDetails = apiService.getCharacterDetail(id)
            Result.Success(characterDetails)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}