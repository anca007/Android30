package com.example.mod9room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SerieDAO {

    @Insert
    fun insert(serie: Serie): Long

    @Update
    fun update(serie: Serie)

    @Delete
    fun delete(serie: Serie)

    @Query("SELECT * FROM Serie WHERE id = :id")
    fun getById(id : Long) : Serie

}