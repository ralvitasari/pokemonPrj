package com.example.pokemonprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemonprj.databinding.ActivityHomePokemonListBinding


class HomePokemonList : AppCompatActivity() {
    private lateinit var homePokemonListBinding: ActivityHomePokemonListBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homePokemonListBinding = ActivityHomePokemonListBinding.inflate(layoutInflater)
        setContentView(homePokemonListBinding.root)

        ViewUtil.setActionBar(
            supportActionBar,
            this,
            R.layout.header_action_bar,
            KonstanObjek.vHomePokemon
        )

        initListPokemon()
    }

    private fun initListPokemon() {
        val imageList = arrayOf(
            R.drawable.pokemonball
        )
        val nameList = arrayOf("Pokemon")
        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                imageList[i],
                desc = "")
            dataArrayList.add(listData)
        }
    }
}