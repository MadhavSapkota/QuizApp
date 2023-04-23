package com.aregyan.github.views.results

import android.os.Bundle
import androidx.navigation.NavDirections
import com.aregyan.github.R
import kotlin.Int
import kotlin.String

public class ResultFragmentDirections private constructor() {
  private data class ActionUserDetailsToResult(
    public val username: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_user_details_to_result

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("username", this.username)
        return result
      }
  }

  public companion object {
    public fun actionUserDetailsToResult(username: String): NavDirections =
        ActionUserDetailsToResult(username)
  }
}
