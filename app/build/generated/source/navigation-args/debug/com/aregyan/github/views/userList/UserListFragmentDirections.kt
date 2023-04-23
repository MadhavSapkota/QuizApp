package com.aregyan.github.views.userList

import android.os.Bundle
import androidx.navigation.NavDirections
import com.aregyan.github.R
import kotlin.Int
import kotlin.String

public class UserListFragmentDirections private constructor() {
  private data class ActionUsersListToUserDetails(
    public val username: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_users_list_to_user_details

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("username", this.username)
        return result
      }
  }

  public companion object {
    public fun actionUsersListToUserDetails(username: String): NavDirections =
        ActionUsersListToUserDetails(username)
  }
}
