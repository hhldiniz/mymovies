package com.example.mymovies.data.models

import androidx.room.Entity

@Entity(primaryKeys = ["username", "password"])
data class User(
    val username: String,
    val password: String
)