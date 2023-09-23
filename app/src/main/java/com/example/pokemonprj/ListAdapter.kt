package com.example.pokemonprj

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonprj.databinding.ItemListPokemonBinding

abstract class ListAdapter(
    private val context: Context,
) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemListPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun getView(view: View?) {
            var view = view
            val listName = view?.findViewById<TextView>(R.id.name_ls_pokemon_tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListPokemonBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(view)
    }
}