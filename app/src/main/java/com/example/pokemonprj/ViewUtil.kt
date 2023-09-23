package com.example.pokemonprj

import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

object ViewUtil {
    fun setActionBar(
        supportActionBar: ActionBar?,
        activity: AppCompatActivity,
        titleLayout: Int,
        titleText: String
    ) {
        val aBar: ActionBar? = supportActionBar

        val viewActionBar: View = activity.layoutInflater.inflate(titleLayout, null)
        val params: ActionBar.LayoutParams =
            ActionBar.LayoutParams( //Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER
            )
        viewActionBar.findViewById<TextView>(R.id.title_hab_tv).text = titleText
        if (aBar != null) {
            aBar.setCustomView(viewActionBar, params)
            aBar.setDisplayShowCustomEnabled(true)
            aBar.setDisplayShowTitleEnabled(false)
            aBar.setDisplayHomeAsUpEnabled(true)
            aBar.setHomeButtonEnabled(true)
        }
    }
}