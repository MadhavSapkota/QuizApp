package com.aregyan.github.views.userDetails

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.aregyan.github.R

public class UserDetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionUserDetailsToResult(): NavDirections =
        ActionOnlyNavDirections(R.id.action_user_details_to_result)
  }
}
