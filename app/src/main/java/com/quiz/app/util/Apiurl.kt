package com.quiz.app.util

object Apiurl {
    const val BASE_URL = "https://quizapi.io/"
    const val API_KEY = "k0zNt5PP4JK6T0enQ0qP67c8xrIPXcIXulXe8fx4"
    const val MIDDLE_WARE = "api/v1/"
    const val CATEGORY = "linux"
    const val LIMIT = "10"
    const val TAGS = "Linux"
    const val url = MIDDLE_WARE+"questions?apiKey=$API_KEY&category=$CATEGORY&limit=$LIMIT&tags=$TAGS"
//    const val url = "https://quizapi.io/api/v1/questions?apiKey=k0zNt5PP4JK6T0enQ0qP67c8xrIPXcIXulXe8fx4&category=linux&limit=10&tags=Linux"
}