// Generated by Dagger (https://dagger.dev).
package com.quiz.app.di;

import android.content.Context;
import com.quiz.app.database.UserDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<UserDatabase> {
  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public UserDatabase get() {
    return provideAppDatabase(appContextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(
      Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(appContextProvider);
  }

  public static UserDatabase provideAppDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAppDatabase(appContext));
  }
}
