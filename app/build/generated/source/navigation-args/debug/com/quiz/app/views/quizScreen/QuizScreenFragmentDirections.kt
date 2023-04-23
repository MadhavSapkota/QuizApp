package com.quiz.app.views.quizScreen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.aregyan.github.R

public class QuizScreenFragmentDirections private constructor() {
  public companion object {
    public fun actionQuizScreenToResult(): NavDirections =
        ActionOnlyNavDirections(R.id.action_quiz_screen_to_result)
  }
}
