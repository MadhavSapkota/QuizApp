package com.quiz.app.repository
import com.quiz.app.database.*
import com.quiz.app.model.Question
import com.quiz.app.network.QuizService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuizRepository @Inject constructor(
    private val quizService: QuizService,
    private val questionDao: QuestionDao
) {

    suspend fun getUserDetails(): List<Question> {
        return quizService.getQuestions()
    }

    suspend fun getAllQuestions(): List<QuestionEntity> {
        return questionDao.getAllQuestions()
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