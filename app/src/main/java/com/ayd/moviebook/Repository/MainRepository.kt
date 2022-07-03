package com.ayd.moviebook.Repository

import com.ayd.moviebook.Service.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllMovies() = retrofitService.getAllMovies()

}