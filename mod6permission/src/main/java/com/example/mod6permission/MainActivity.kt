package com.example.mod6permission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val activityContract =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                Intent(Intent.ACTION_CALL, Uri.parse("tel:0606060606")).also {
                    startActivity(it)
                }
            }else{

                Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606")).also {
                    startActivity(it)
                }

            }

        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityContract.launch(android.Manifest.permission.CALL_PHONE)

    }
}