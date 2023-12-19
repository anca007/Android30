package com.example.mod8tpdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    var dice = 1
    var totalLeft = 0
    var totalRight = 0
    var nbLaunchLeft = 0
    var nbLaunchRight = 0
    var imageId = R.drawable.d6
    var totalLaunch = MutableLiveData<Int>(0)

    fun launchLeft(){
        nbLaunchLeft++
        totalLeft += launchDice()
    }

    fun launchRight(){
        nbLaunchRight++
        totalRight += launchDice()
    }

    fun launchDice(): Int {
        totalLaunch.value = totalLaunch.value?.inc()
        dice = (1..6).random()

        imageId = when(dice){
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            6 -> R.drawable.d6
            else -> R.drawable.d6
        }

        return dice
    }

}