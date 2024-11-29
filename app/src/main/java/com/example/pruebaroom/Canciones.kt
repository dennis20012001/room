package com.example.pruebaroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "canciones")
data class Canciones (
    @PrimaryKey val id: Int,
    val tituloDeLaCancion:String,
    val autor: String,
    val videoURL: String
    )