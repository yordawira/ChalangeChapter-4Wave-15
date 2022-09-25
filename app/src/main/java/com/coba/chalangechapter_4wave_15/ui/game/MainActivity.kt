package com.coba.chalangechapter_4wave_15.ui.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coba.chalangechapter_4wave_15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}