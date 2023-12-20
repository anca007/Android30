package com.example.mod11api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var vm : JokeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this)[JokeViewModel::class.java]
        val tvJoke = findViewById<TextView>(R.id.tv_joke)

        vm.getRandomJoke().observe(this){
            tvJoke.text = it.value
        }

    }
}