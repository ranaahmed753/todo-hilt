// Generated by Dagger (https://dagger.dev).
package edu.notes.hiltapp.mvvm.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TodoViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static TodoViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(TodoViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final TodoViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TodoViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}