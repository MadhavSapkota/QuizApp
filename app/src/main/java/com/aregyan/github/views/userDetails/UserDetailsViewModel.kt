package com.aregyan.github.views.userDetails
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

    fun getUserDetails() {
        viewModelScope.launch {
            try{
            val userDetails = userDetailsRepository.getUserDetails()
            _questions.value = userDetails
        }catch (e: Exception) {
                _error.value = "Error: ${e.message}"
            }
        }
    }
}