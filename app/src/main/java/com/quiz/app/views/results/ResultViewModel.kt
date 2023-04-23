package com.quiz.app.views.results

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.quiz.app.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(
    private val quizRepository: QuizRepository
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
