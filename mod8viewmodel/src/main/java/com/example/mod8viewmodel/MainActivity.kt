package com.example.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mod8viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm: CounterViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vm = ViewModelProvider(this)[CounterViewModel::class.java]

        //récupération de la valeur de la variable du viewModel
        //findViewById<TextView>(R.id.tv_cpt).text = vm.counter.toString()


        vm.counter.observe(this) {
            binding.vm = vm
        }
//        binding.vm = vm
//        binding.lifecycleOwner = this

        //au clic j'incrémente
        findViewById<Button>(R.id.button).setOnClickListener {
            // findViewById<TextView>(R.id.tv_cpt).text = vm.increment().toString()
            vm.increment()
        }


    }
}