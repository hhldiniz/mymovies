package com.example.mymovies.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.mymovies.data.models.Movie

@Dao
interface MovieDao {

    @Insert
    fun insert(vararg movie: Movie)

    @Update
    fun update(vararg movie: Movie): Int

    @Delete
    fun delete(vararg movie: Movie)
}