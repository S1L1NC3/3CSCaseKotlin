package com.dmd.a3cscasejava.api

import PokemonsResponse
import com.dmd.a3cscasejava.models.PokemonDetailResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Service{
    private val connectionString = "https://pokeapi.co/api/v2/"

    private val api = Retrofit.Builder()
        .baseUrl(connectionString)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(API::class.java)

    fun getData() : Single<PokemonsResponse> {
        return api.getPokemons()
    }

    fun getPokemonDetail(pokemonName: String) : Single<PokemonDetailResponse>{
        return api.getPokemonByName(pokemonName)
    }
}