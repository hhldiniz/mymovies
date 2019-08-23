package com.example.mymovies.data.repository

import com.example.mymovies.data.models.User
import com.example.mymovies.utils.GeneralUtils.db
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class UserRepository {

    private val userDao = db.getUserDao()

    fun saveAsync(vararg user: User): Deferred<Unit>{
        return GlobalScope.async {
            userDao.insert(*user)
        }
    }

    fun loginAsync(username: String, password: String): Deferred<User?>{
        return GlobalScope.async {
            userDao.getByUsernameAndPassword(username, password).value
        }
    }
}