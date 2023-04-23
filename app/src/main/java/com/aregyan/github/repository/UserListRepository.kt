package com.aregyan.github.repository

import com.aregyan.github.database.UsersDatabase
import com.aregyan.github.network.UserDetailsService
import javax.inject.Inject

class UserListRepository @Inject constructor(
    private val userListService: UserDetailsService,
    private val database: UsersDatabase
) {

//    val users: LiveData<List<UserListItem>> =
//        Transformations.map(database.usersDao.getDatabaseUsers()) {
//            it.asDomainModel()
//        }

//    suspend fun refreshUserList() {
//        try {
//            val users = userListService.getUserList()
//            database.usersDao.insertAll(users.asDatabaseModel())
//        } catch (e: Exception) {
//            Timber.w(e)
//        }
//    }
}