package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    val vm: SerieViewModel by viewModels { SerieViewModel.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serie = Serie(
            0,
            "Code Quantum",
            Type.SF,
            "Un mec se ballade dans le temps",
            5
        )

        vm.addSerie(serie).observe(this) {
            Log.i(TAG, "Id de la série $it")

            vm.getSerie(it)

            vm.serie.observe(this) { serie ->
                Log.i(TAG, "Serie : ${serie.toString()}")
            }

        }


    }
}