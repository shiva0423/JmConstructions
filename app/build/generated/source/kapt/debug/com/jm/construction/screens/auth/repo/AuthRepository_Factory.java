// Generated by Dagger (https://dagger.dev).
package com.jm.construction.screens.auth.repo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  @Override
  public AuthRepository get() {
    return newInstance();
  }

  public static AuthRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthRepository newInstance() {
    return new AuthRepository();
  }

  private static final class InstanceHolder {
    private static final AuthRepository_Factory INSTANCE = new AuthRepository_Factory();
  }
}