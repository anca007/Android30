package com.example.mod10recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produits = listOf(
            Product("Tomates", 2.5f, Type.FRAIS, 4.2f),
            Product("Poulet", 8.0f, Type.SURGELE, 4.5f),
            Product("Riz basmati", 3.99f, Type.EPICERIE, 4.8f),
            Product("Shampooing", 5.49f, Type.DPH, 4.3f),
            Product("Poires", 3.0f, Type.FRAIS, 4.1f),
            Product("Marteau", 12.99f, Type.QUINCAILLERIE, 4.0f),
            Product("Glace à la vanille", 6.99f, Type.SURGELE, 4.7f),
            Product("Tournevis", 8.75f, Type.QUINCAILLERIE, 4.2f),
            Product("Pâtes", 1.49f, Type.EPICERIE, 4.5f),
            Product("Dentifrice", 2.99f, Type.DPH, 4.4f),
            Product("Pommes de terre", 2.0f, Type.FRAIS, 4.6f),
            Product("Pizza surgelée", 4.79f, Type.SURGELE, 4.3f),
            Product("Clé à molette", 15.25f, Type.QUINCAILLERIE, 4.1f),
            Product("Huile d'olive", 7.99f, Type.EPICERIE, 4.9f),
            Product("Mouchoirs", 1.0f, Type.DPH, 4.0f)
        )


        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = ProductAdapter(produits) { name ->
            Intent(this, TargetActivity::class.java).also {
                it.putExtra("name", name)
                startActivity(it)
            }
        }
        recycler.layoutManager = LinearLayoutManager(this)
        //recycler.layoutManager = GridLayoutManager(this, 4)


    }
}