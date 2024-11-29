package com.example.pruebaroom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.pruebaroom.Gestor.MyRoomDatabase
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            this,
            MyRoomDatabase::class.java,
            "myDatabase"
        ).build()
        GlobalScope.launch(Dispatchers.IO) {
            val listado: List<Canciones> = db.cancionesDao().getAll()
            GlobalScope.launch(Dispatchers.Main) {
            

            }
        }

    }
}