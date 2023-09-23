package com.example.pokemonprj

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemonprj.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var splashActivityBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashActivityBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashActivityBinding.root)

        splashActivityBinding.apply {
            startBtn.setOnClickListener {
                navigateToHome(this@SplashActivity)
            }
        }

    }
}