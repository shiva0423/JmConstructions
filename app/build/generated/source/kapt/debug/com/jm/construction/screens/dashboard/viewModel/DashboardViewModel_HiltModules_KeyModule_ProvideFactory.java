// Generated by Dagger (https://dagger.dev).
package com.jm.construction.screens.dashboard.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DashboardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static DashboardViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(DashboardViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final DashboardViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DashboardViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
