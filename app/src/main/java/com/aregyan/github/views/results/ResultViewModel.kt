package com.aregyan.github.views.results

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aregyan.github.repository.UserDetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(
    private val userDetailsRepository: UserDetailsRepository
) : ViewModel() {

    // Create MutableLiveData to hold the result data
    private val _resultText = MutableLiveData<String>()
    val resultText: LiveData<String>
        get() = _resultText

    // Set a default value for the result text
    init {
        _resultText.value = "No result yet"
    }

    // Function to update the result text
    fun updateResultText(newResult: String) {
        _resultText.value = newResult
    }
}
