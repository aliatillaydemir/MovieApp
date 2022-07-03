package com.ayd.moviebook.Model


import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("items")
    val mList: List<Movie>
)