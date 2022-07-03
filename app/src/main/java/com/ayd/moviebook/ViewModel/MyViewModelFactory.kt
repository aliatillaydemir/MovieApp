package com.ayd.moviebook.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ayd.moviebook.Repository.MainRepository
import java.lang.IllegalArgumentException

class MyViewModelFactory constructor(private val repository: MainRepository): ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            MainViewModel(this.repository) as T
        }else{
            throw IllegalArgumentException("ViewModel bulunamadı")
        }
    }

}