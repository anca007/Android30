package com.example.mod9room

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SerieDbTest {

    lateinit var db: SerieDatabase

    @Before
    fun createDb() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            SerieDatabase::class.java
        ).build()
    }

    @Test
    fun testInsertSerie() {

        val serie = Serie(
            0,
            "K2000",
            Type.SF,
            "Une voiture qui parle et qui saute",
            4
        )

        val id = db.serieDAO().insert(serie)

        Assert.assertTrue(
            "Mauvaise serie !",
            db.serieDAO().getById(id).title == "K2000"
        )
    }

}