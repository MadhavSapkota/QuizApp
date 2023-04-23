package com.aregyan.github.database
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question")
data class QuestionEntity(
    @PrimaryKey
    val id: Int,
    val question: String?,
    @Embedded
    val answers: AnswersEntity?,
    val correctAnswer: String?,
    val multipleCorrectAnswers: String?,
)

data class AnswersEntity(
    val answerA: String?,
    val answerB: String?,
    val answerC: String?,
    val answerD: String?,
    val answerE: String?,
    val answerF: String?
)
