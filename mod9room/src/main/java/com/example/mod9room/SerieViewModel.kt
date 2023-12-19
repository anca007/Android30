package com.example.mod9room

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SerieViewModel(private val serieDAO: SerieDAO) : ViewModel() {

    var serie = MutableLiveData<Serie>()

    fun addSerie(serie: Serie): MutableLiveData<Long> {

        var id = MutableLiveData<Long>()

        viewModelScope.launch(Dispatchers.IO) {
            id.postValue(serieDAO.insert(serie))
        }
        return id
    }

    fun getSerie(id : Long){
        viewModelScope.launch(Dispatchers.IO){
            serie.postValue(serieDAO.getById(id))
        }
    }

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[APPLICATION_KEY])

                return SerieViewModel(
                    SerieDatabase.getInstance(application.applicationContext).serieDAO()
                ) as T
            }
        }
    }
}