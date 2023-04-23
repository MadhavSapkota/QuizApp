package com.aregyan.github.repository
import com.aregyan.github.database.*
import com.aregyan.github.model.Question
import com.aregyan.github.network.UserDetailsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserDetailsRepository @Inject constructor(
    private val userDetailsService: UserDetailsService,
    private val questionDao: QuestionDao
) {

    suspend fun getUserDetails(): List<Question> {
        return userDetailsService.getQuestions()
    }

    suspend fun saveQuestions(questions: List<Question>) {
        withContext(Dispatchers.IO) {
            val questionEntities = questions.map { question ->
                QuestionEntity(
                    id = question.id ?: 0,
                    question = question.question,

                    answers = question.answers?.let {
                        AnswersEntity(
                            answerA = it.answerA,
                            answerB = it.answerB,
                            answerC = it.answerC,
                            answerD = it.answerD,
                            answerE = it.answerE as String?,
                            answerF = it.answerF as String?
                        )
                    },
                    multipleCorrectAnswers = question.multipleCorrectAnswers,
                    correctAnswer = question.correctAnswer as String?,
                )
            }
            questionDao.insertAll(questionEntities)
        }
    }


}