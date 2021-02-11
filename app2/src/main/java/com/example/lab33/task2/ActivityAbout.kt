package com.example.lab33.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab33.databinding.AboutBinding

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = AboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "About"
    }
}