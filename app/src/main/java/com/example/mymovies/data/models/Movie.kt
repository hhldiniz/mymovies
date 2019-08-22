package com.example.mymovies.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    @PrimaryKey val movieId: Int,
    @ColumnInfo val originalLanguage: String,
    @ColumnInfo val posterPath: String,
    @ColumnInfo val originalTitle: String
)