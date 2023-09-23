package com.example.pokemonprj

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.pokemonprj.R.anim.*

fun navigateToHome(context: Context) {
    if (context is Activity) {
        val flags = context.flags(Intent.FLAG_ACTIVITY_NEW_TASK, Intent.FLAG_ACTIVITY_CLEAR_TOP)
        context.start<HomePokemonList>(flags, right_in, left_out)
    }
}