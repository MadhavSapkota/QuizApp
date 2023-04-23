package com.aregyan.github.network
import com.aregyan.github.model.Question
import com.aregyan.github.util.Apiurl
import retrofit2.http.GET

interface UserDetailsService {
    @GET(Apiurl.url)
    suspend fun getQuestions(): List<Question>
}