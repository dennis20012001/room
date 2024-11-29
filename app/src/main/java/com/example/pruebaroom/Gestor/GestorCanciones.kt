package com.example.pruebaroom.Gestor

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pruebaroom.Canciones



@Database(entities = [Canciones::class], version = 1)
abstract class MyRoomDatabase : RoomDatabase() {
    companion object {
        @Volatile
        private var instance: MyRoomDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }
        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context,
            MyRoomDatabase::class.java, "myDatabase"
        ).build()
    }
    abstract fun cancionesDao(): CancionesDao
}
