// Generated by Dagger (https://dagger.dev).
package com.jm.construction.screens.dashboard.viewModel;

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
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  @Override
  public DashboardViewModel get() {
    return newInstance();
  }

  public static DashboardViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DashboardViewModel newInstance() {
    return new DashboardViewModel();
  }

  private static final class InstanceHolder {
    private static final DashboardViewModel_Factory INSTANCE = new DashboardViewModel_Factory();
  }
}
