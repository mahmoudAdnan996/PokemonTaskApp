package com.mahmoudadnan.pokemontaskapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mahmoudadnan.pokemontaskapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PokemonsActivity extends AppCompatActivity {

    PokemonViewModel pokemonViewModel;

    @BindView(R.id.pokemonNameTV)
    TextView pokemonName;
    @BindView(R.id.frontImage)
    ImageView frontImage;
    @BindView(R.id.backImage)
    ImageView backImage;
    @BindView(R.id.progress)
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemons);
        ButterKnife.bind(this);

        pokemonViewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        pokemonViewModel.getPokemon();

        pokemonViewModel.pokemonLiveData.observe(this,pokemon -> {
            if (pokemon == null){
                Toast.makeText(this, "Somthing went wromg", Toast.LENGTH_LONG).show();
                return;
            }
            progressBar.setVisibility(View.GONE);
            pokemonName.setText(pokemon.getName());
            Glide.with(this).load(pokemon.getSprites().getFront_default()).into(frontImage);
            Glide.with(this).load(pokemon.getSprites().getBack_default()).into(backImage);
        });
    }

    @OnClick(R.id.refreshBtn)
    public void onClick(){
        progressBar.setVisibility(View.VISIBLE);
        pokemonViewModel.getPokemon();
    }
}