// Generated by Dagger (https://dagger.dev).
package com.aregyan.github.repository;

import com.aregyan.github.network.UserDetailsService;
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
public final class UserDetailsRepository_Factory implements Factory<UserDetailsRepository> {
  private final Provider<UserDetailsService> userDetailsServiceProvider;

  public UserDetailsRepository_Factory(Provider<UserDetailsService> userDetailsServiceProvider) {
    this.userDetailsServiceProvider = userDetailsServiceProvider;
  }

  @Override
  public UserDetailsRepository get() {
    return newInstance(userDetailsServiceProvider.get());
  }

  public static UserDetailsRepository_Factory create(
      Provider<UserDetailsService> userDetailsServiceProvider) {
    return new UserDetailsRepository_Factory(userDetailsServiceProvider);
  }

  public static UserDetailsRepository newInstance(UserDetailsService userDetailsService) {
    return new UserDetailsRepository(userDetailsService);
  }
}