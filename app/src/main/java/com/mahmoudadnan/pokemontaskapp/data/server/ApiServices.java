package com.mahmoudadnan.pokemontaskapp.data.server;

import com.mahmoudadnan.pokemontaskapp.data.models.Pokemon;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiServices {

    @GET("/api/v2/pokemon/{ditto}")
    Observable<Response<Pokemon>> getPokemon(@Path("ditto") int ditto);
}
