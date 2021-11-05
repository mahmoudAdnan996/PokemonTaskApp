package com.mahmoudadnan.pokemontaskapp.repository;

import com.mahmoudadnan.pokemontaskapp.data.models.Pokemon;
import com.mahmoudadnan.pokemontaskapp.data.server.ApiServices;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Response;

public class Repository {

    private ApiServices apiServices;

    @Inject
    public Repository(ApiServices apiServices) {
        this.apiServices = apiServices;
    }

    public Observable<Response<Pokemon>> getPokemon(int ditto){
        return apiServices.getPokemon(ditto);
    }
}
