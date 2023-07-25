package com.example.geeks_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geeks_kotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var n : Int = intent.getIntExtra("num", 10)
        binding.tv.text = (n).toString()

        binding.btnMinus.setOnClickListener {
            if(n == 0) {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("num2", n);
                startActivity(intent)
                finish()
            }
            else {
                binding.tv.text = (--n).toString()
            }
        }
    }
}