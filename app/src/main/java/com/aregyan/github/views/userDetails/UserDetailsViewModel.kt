package com.aregyan.github.views.userDetails
import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aregyan.github.model.Question
import com.aregyan.github.repository.UserDetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserDetailsViewModel @Inject constructor(
    private val userDetailsRepository: UserDetailsRepository
) : ViewModel() {
    private val _questions = MutableLiveData<List<Question>>()
    val questions: LiveData<List<Question>> = _questions

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    var isFirstLoad = true

    @SuppressLint("SuspiciousIndentation")
    fun getUserDetails() {
        viewModelScope.launch {
            try{
            val userDetails = userDetailsRepository.getUserDetails()
            _questions.value = userDetails
                userDetailsRepository.saveQuestions(userDetails)

        }catch (e: Exception) {
                _error.value = "Error: ${e.message}"
            }
        }
    }
}