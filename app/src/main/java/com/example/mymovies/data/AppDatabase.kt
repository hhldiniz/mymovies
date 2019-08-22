package com.example.mymovies.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mymovies.data.dao.MovieDao
import com.example.mymovies.data.dao.UserDao
import com.example.mymovies.data.models.Movie
import com.example.mymovies.data.models.User

@Database(entities = [
    User::class,
    Movie::class
], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getUserDao(): UserDao
    abstract fun getMovieDao(): MovieDao
}