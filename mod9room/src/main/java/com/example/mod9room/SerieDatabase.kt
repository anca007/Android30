package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Serie::class], version = 1)
abstract class SerieDatabase : RoomDatabase() {

    //lister les daos
    abstract fun serieDAO(): SerieDAO


    //création du singleton de la base
    companion object {

        private var INSTANCE: SerieDatabase? = null

        fun getInstance(context: Context): SerieDatabase {

            var instance = INSTANCE

            if (instance == null) {

                instance = Room.databaseBuilder(
                    context,
                    SerieDatabase::class.java,
                    "series"
                ).fallbackToDestructiveMigration().build()

                INSTANCE = instance
            }

            return instance
        }


    }


}