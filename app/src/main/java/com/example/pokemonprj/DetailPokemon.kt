package com.example.pokemonprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemonprj.databinding.ActivityDetailPokemonBinding
import com.example.pokemonprj.databinding.ActivityHomePokemonListBinding

class DetailPokemon : AppCompatActivity() {
    private lateinit var detailPokemonBinding: ActivityDetailPokemonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailPokemonBinding = ActivityDetailPokemonBinding.inflate(layoutInflater)
        setContentView(detailPokemonBinding.root)

        ViewUtil.setActionBar(
            supportActionBar,
            this,
            R.layout.header_action_bar,
            KonstanObjek.vDetail
        )
    }
}