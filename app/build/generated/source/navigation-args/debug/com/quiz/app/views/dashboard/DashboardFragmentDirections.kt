package com.quiz.app.views.dashboard

import android.os.Bundle
import androidx.navigation.NavDirections
import com.aregyan.github.R
import kotlin.Int
import kotlin.String

public class DashboardFragmentDirections private constructor() {
  private data class ActionDashboardToQuizList(
    public val username: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_dashboard_to_quiz_list

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("username", this.username)
        return result
      }
  }

  public companion object {
    public fun actionDashboardToQuizList(username: String): NavDirections =
        ActionDashboardToQuizList(username)
  }
}
