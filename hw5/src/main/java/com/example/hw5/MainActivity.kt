package com.example.hw5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(binding.container1.id, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(binding.container2.id, SecondFragment()).commit()
    }

}