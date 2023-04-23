package com.aregyan.github.repository
import com.aregyan.github.model.Question
import com.aregyan.github.network.UserDetailsService
import javax.inject.Inject

class UserDetailsRepository @Inject constructor(
    private val userDetailsService: UserDetailsService
) {

    suspend fun getUserDetails(): List<Question> {
        return userDetailsService.getQuestions()
    }

}