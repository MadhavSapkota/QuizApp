// Generated by Dagger (https://dagger.dev).
package com.quiz.app.repository;

import com.quiz.app.database.QuestionDao;
import com.quiz.app.network.QuizService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuizRepository_Factory implements Factory<QuizRepository> {
  private final Provider<QuizService> quizServiceProvider;

  private final Provider<QuestionDao> questionDaoProvider;

  public QuizRepository_Factory(Provider<QuizService> quizServiceProvider,
      Provider<QuestionDao> questionDaoProvider) {
    this.quizServiceProvider = quizServiceProvider;
    this.questionDaoProvider = questionDaoProvider;
  }

  @Override
  public QuizRepository get() {
    return newInstance(quizServiceProvider.get(), questionDaoProvider.get());
  }

  public static QuizRepository_Factory create(Provider<QuizService> quizServiceProvider,
      Provider<QuestionDao> questionDaoProvider) {
    return new QuizRepository_Factory(quizServiceProvider, questionDaoProvider);
  }

  public static QuizRepository newInstance(QuizService quizService, QuestionDao questionDao) {
    return new QuizRepository(quizService, questionDao);
  }
}
