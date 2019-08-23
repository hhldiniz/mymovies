package com.example.mymovies.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.mymovies.data.repository.UserRepository

class LoginFragmentViewModel(private val userRepository: UserRepository, application: Application):
    AndroidViewModel(application), LifecycleObserver {

    var username = ""
    var password = ""

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun load(){

    }

    fun loginAsync() = userRepository.loginAsync(username, password)
}