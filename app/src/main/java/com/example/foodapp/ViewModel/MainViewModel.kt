package com.example.foodapp.ViewModel

import androidx.lifecycle.LiveData
import com.example.foodapp.Domain.CategoryModel
import com.example.foodapp.Repository.MainRepository

class MainViewModel {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }
}