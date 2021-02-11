package com.example.lab33.task4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.lab33.R
import com.example.lab33.databinding.Activity2Binding
import com.example.lab33.task2.ActivityAbout

class Activity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Activity8"

        binding.Go21.setOnClickListener {
           finish()
        }

        binding.Go23.setOnClickListener{
            startActivity(Intent(this, Activity3::class.java))
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