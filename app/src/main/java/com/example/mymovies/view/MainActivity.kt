package com.example.mymovies.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.mymovies.R
import com.example.mymovies.data.AppDatabase

class MainActivity : AppCompatActivity() {

    val db : AppDatabase by lazy {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "movies").build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
