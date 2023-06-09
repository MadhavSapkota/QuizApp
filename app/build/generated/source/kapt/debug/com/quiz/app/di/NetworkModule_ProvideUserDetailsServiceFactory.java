// Generated by Dagger (https://dagger.dev).
package com.quiz.app.di;

import com.quiz.app.network.QuizService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideUserDetailsServiceFactory implements Factory<QuizService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideUserDetailsServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public QuizService get() {
    return provideUserDetailsService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideUserDetailsServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideUserDetailsServiceFactory(retrofitProvider);
  }

  public static QuizService provideUserDetailsService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideUserDetailsService(retrofit));
  }
}
