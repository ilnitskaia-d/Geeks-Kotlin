package com.example.hw5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Model> = arrayListOf(
        Model(1,"Name", "Author", "0:00"),
        Model(2,"Name", "Author", "0:00"),
        Model(3,"Name", "Author", "0:00"),
        Model(4,"Name", "Author", "0:00"),
        Model(5,"Name", "Author", "0:00"),
        Model(6,"Name", "Author", "0:00"),
        Model(7,"Name", "Author", "0:00"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(binding.container1.id, FirstFragment()).commit()
        //supportFragmentManager.beginTransaction().add(binding.container2.id, SecondFragment()).commit()
        val adapter  = ModelAdapter(list, this::onClick)
        binding.rv.adapter = adapter
    }
    private fun onClick(position: Int){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}