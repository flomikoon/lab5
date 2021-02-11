package com.example.lab33.task3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.lab33.R
import com.example.lab33.databinding.Activity1Binding
import com.example.lab33.task2.ActivityAbout

class Activity1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Activity4"

        binding.Go12.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) =
            when (item.itemId) {
                R.id.about_button -> {
                    startActivity(Intent(this, ActivityAbout::class.java))
                    true
                }
                else -> {
                    super.onOptionsItemSelected(item)
                }
            }

}