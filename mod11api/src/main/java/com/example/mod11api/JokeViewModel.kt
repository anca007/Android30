package com.example.mod11api

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {
    fun getRandomJoke(): MutableLiveData<Joke> {
        val joke = MutableLiveData<Joke>()
        viewModelScope.launch {
            joke.value = JokeService.JokeApi.retrofitService.getRandomFact()
        }
        return joke
    }
}