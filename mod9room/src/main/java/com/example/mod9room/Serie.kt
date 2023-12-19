package com.example.mod9room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Type{
    SF, DRAMA, WESTERN, COMEDY, HORROR
}

@Entity
data class Serie(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val title : String,
    val type : Type,
    @ColumnInfo("overview")
    val description : String,
    val seasonNumber : Int
)
