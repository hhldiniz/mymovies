package com.example.mymovies.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymovies.data.repository.UserRepository
import java.lang.IllegalArgumentException

class SignupFragmentViewModelFactory(
    private val userRepository: UserRepository,
    private val application: Application
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return with(modelClass){
            @Suppress("UNCHECKED_CAST")
            when{
                isAssignableFrom(SignupFragmentViewModel::class.java)->
                    SignupFragmentViewModelFactory(userRepository, application)
                else->
                    throw IllegalArgumentException("Unknown class")
            } as T
        }
    }
}