package com.aregyan.github.di
import android.content.Context
import androidx.room.Room
import com.aregyan.github.database.QuestionDao
import com.aregyan.github.database.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): UserDatabase {
        return Room.databaseBuilder(
            appContext,
            UserDatabase::class.java,
            "Users"
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideChannelDao(usersDatabase: UserDatabase): QuestionDao {
        return usersDatabase.questionDao()
    }

}