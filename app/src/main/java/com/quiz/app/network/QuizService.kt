package com.quiz.app.network
import com.quiz.app.model.Question
import com.quiz.app.util.Apiurl
import retrofit2.http.GET

interface QuizService {
    @GET(Apiurl.url)
    suspend fun getQuestions(): List<Question>
}