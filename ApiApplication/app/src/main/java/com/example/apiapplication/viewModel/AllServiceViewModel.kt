package com.example.apiapplication.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiapplication.model.Items
import com.example.apiapplication.apiService.ApiService
import kotlinx.coroutines.launch

class AllServiceViewModel : ViewModel() {

    var liveDataAllService: List<Items> by mutableStateOf(listOf())

    fun getAllService() {
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            val allService = apiService.getAllService(1)
            liveDataAllService = allService.items
        }
    }


}