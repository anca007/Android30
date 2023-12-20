package com.example.mod10recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val productName = intent.getStringExtra("name")
        findViewById<TextView>(R.id.textView).text = productName
    }
}