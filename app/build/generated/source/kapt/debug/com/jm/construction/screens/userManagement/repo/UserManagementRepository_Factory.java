// Generated by Dagger (https://dagger.dev).
package com.jm.construction.screens.userManagement.repo;

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
public final class UserManagementRepository_Factory implements Factory<UserManagementRepository> {
  @Override
  public UserManagementRepository get() {
    return newInstance();
  }

  public static UserManagementRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserManagementRepository newInstance() {
    return new UserManagementRepository();
  }

  private static final class InstanceHolder {
    private static final UserManagementRepository_Factory INSTANCE = new UserManagementRepository_Factory();
  }
}
