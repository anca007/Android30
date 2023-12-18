package com.example.mod6intentexplicite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val temperature = intent.getIntExtra("temperature", 0)

        findViewById<TextView>(R.id.textView).text = temperature.toString()


    }
}