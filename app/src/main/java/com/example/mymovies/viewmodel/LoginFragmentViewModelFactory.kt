package com.example.mymovies.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymovies.data.repository.UserRepository
import java.lang.IllegalArgumentException

class LoginFragmentViewModelFactory(private val repository: UserRepository, private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return with(modelClass){
            when{
                isAssignableFrom(LoginFragmentViewModel::class.java)->
                    LoginFragmentViewModel(repository, application)
                else->
                    throw IllegalArgumentException("Unknown class")
            }
        } as T
    }
}