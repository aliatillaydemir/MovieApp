package com.ayd.moviebook.Model


import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val imdbID: String,
    @SerializedName("image")
    val poster: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("year")
    val year: String,
    @SerializedName("imDbRating")
    val rating: String,
)