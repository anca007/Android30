package com.example.mod6intentimplicite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.0392,-1.7")).also {
            startActivity(it)
        }


    }
}