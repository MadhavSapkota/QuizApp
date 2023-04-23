package com.quiz.app.model
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Question {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("question")
    @Expose
    var question: String? = null

    @SerializedName("description")
    @Expose
    var description: Any? = null

    @SerializedName("answers")
    @Expose
    var answers: Answers? = null

    @SerializedName("multiple_correct_answers")
    @Expose
    var multipleCorrectAnswers: String? = null

    @SerializedName("correct_answers")
    @Expose
    var correctAnswers: CorrectAnswers? = null

    @SerializedName("correct_answer")
    @Expose
    var correctAnswer: Any? = null

    @SerializedName("explanation")
    @Expose
    var explanation: Any? = null

    @SerializedName("tip")
    @Expose
    var tip: Any? = null

    @SerializedName("tags")
    @Expose
    var tags: List<Tag>? = null

    @SerializedName("category")
    @Expose
    var category: String? = null

    @SerializedName("difficulty")
    @Expose
    var difficulty: String? = null
}
class Answers {
    @SerializedName("answer_a")
    @Expose
    var answerA: String? = null

    @SerializedName("answer_b")
    @Expose
    var answerB: String? = null

    @SerializedName("answer_c")
    @Expose
    var answerC: String? = null

    @SerializedName("answer_d")
    @Expose
    var answerD: String? = null

    @SerializedName("answer_e")
    @Expose
    var answerE: Any? = null

    @SerializedName("answer_f")
    @Expose
    var answerF: Any? = null
}
class CorrectAnswers {
    @SerializedName("answer_a_correct")
    @Expose
    var answerACorrect: String? = null

    @SerializedName("answer_b_correct")
    @Expose
    var answerBCorrect: String? = null

    @SerializedName("answer_c_correct")
    @Expose
    var answerCCorrect: String? = null

    @SerializedName("answer_d_correct")
    @Expose
    var answerDCorrect: String? = null

    @SerializedName("answer_e_correct")
    @Expose
    var answerECorrect: String? = null

    @SerializedName("answer_f_correct")
    @Expose
    var answerFCorrect: String? = null
}
class Tag {
    @SerializedName("name")
    @Expose
    var name: String? = null
}