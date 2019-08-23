package com.example.mymovies.data.repository

import com.example.mymovies.data.models.User
import com.example.mymovies.utils.GeneralUtils.db
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class UserRepository {

    private val userDao = db.getUserDao()

    fun save(vararg user: User): Deferred<Unit>{
        return GlobalScope.async {
            userDao.insert(*user)
        }
    }
}