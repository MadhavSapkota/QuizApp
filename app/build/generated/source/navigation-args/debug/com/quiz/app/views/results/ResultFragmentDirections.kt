package com.quiz.app.views.results

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.aregyan.github.R

public class ResultFragmentDirections private constructor() {
  public companion object {
    public fun actionResultQuiz(): NavDirections = ActionOnlyNavDirections(R.id.action_result_quiz)
  }
}
