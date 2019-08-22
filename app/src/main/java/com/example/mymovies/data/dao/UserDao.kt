package com.example.mymovies.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.mymovies.data.models.User

@Dao
interface UserDao {

    @Insert
    fun insert(vararg user: User)

    @Update
    fun update(vararg user: User): Int

    @Delete
    fun delete(vararg user: User)
}