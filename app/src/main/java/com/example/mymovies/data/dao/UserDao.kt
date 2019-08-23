package com.example.mymovies.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mymovies.data.models.User

@Dao
interface UserDao {

    @Insert
    fun insert(vararg user: User)

    @Update
    fun update(vararg user: User): Int

    @Delete
    fun delete(vararg user: User)

    @Query("SELECT * FROM User WHERE username = :username AND password = :password")
    fun getByUsernameAndPassword(username: String, password: String): LiveData<User?>
}