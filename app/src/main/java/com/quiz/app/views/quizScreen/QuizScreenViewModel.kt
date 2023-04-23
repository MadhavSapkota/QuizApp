package com.quiz.app.views.quizScreen
import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quiz.app.model.Question
import com.quiz.app.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizScreenViewModel @Inject constructor(
    private val quizRepository: QuizRepository
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
            val userDetails = quizRepository.getUserDetails()
            _questions.value = userDetails
                quizRepository.saveQuestions(userDetails)

        }catch (e: Exception) {
                _error.value = "Error: ${e.message}"
            }
        }
    }
}