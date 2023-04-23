package com.aregyan.github.views.userList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(
) : ViewModel() {
    var username: String? = null

    init {
        viewModelScope.launch(Dispatchers.IO) {
        }
    }
}