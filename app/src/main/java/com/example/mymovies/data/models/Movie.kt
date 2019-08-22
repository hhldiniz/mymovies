package com.example.mymovies.data.models

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Movie(
    @PrimaryKey val movieId: Int,
    @ColumnInfo val originalLanguage: String,
    @ColumnInfo val posterPath: String,
    @ColumnInfo val originalTitle: String
)