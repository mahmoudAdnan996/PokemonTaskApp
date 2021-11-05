package com.mahmoudadnan.pokemontaskapp.view;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mahmoudadnan.pokemontaskapp.data.models.Pokemon;
import com.mahmoudadnan.pokemontaskapp.repository.Repository;

import java.util.Random;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

@HiltViewModel
public class PokemonViewModel extends ViewModel {

    private Repository repository;
    MutableLiveData<Pokemon> pokemonLiveData = new MutableLiveData<>();

    @Inject
    public PokemonViewModel(Repository repository) {
        this.repository = repository;
    }

    public void getPokemon(){

        repository.getPokemon(getRandomValue())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(pokemonResponse -> {
                    if (pokemonResponse.code() == 200 && pokemonResponse.body() != null)
                        pokemonLiveData.setValue(pokemonResponse.body());
                }, error ->{
                    Log.e("TAG", "getPokemon: " + error.getMessage());
                    pokemonLiveData.setValue(null);
                });
    }

    private int getRandomValue(){
        Random random = new Random();
        return random.nextInt(1000);
    }
}
