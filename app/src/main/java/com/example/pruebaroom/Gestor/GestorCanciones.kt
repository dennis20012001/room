package com.example.pruebaroom.Gestor

import androidx.room.Dao
import androidx.room.Query
import com.example.pruebaroom.Canciones

@Dao
interface Canciones{
    @Query ("Select * from canciones")
    fun getAll() : List <Canciones>
}