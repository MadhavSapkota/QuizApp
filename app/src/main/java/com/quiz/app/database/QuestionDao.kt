package com.quiz.app.database
import androidx.room.*

@Dao
interface QuestionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(questions: List<QuestionEntity>)

    @Query("SELECT * FROM question")
    fun getAllQuestions(): List<QuestionEntity>
}

@Database(entities = [QuestionEntity::class], version = 2, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}
