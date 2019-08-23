package com.example.mymovies.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import com.example.mymovies.data.repository.UserRepository

class SignupFragmentViewModel(private val userRepository: UserRepository, application: Application):
    AndroidViewModel(application), LifecycleObserver {
    val username = ""
    val password = ""
    val passwordConfirmation = ""


}