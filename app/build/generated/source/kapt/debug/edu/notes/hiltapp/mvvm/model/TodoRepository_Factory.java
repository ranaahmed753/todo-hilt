// Generated by Dagger (https://dagger.dev).
package edu.notes.hiltapp.mvvm.model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import edu.notes.hiltapp.room.dao.TodoDao;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TodoRepository_Factory implements Factory<TodoRepository> {
  private final Provider<TodoDao> todoDaoProvider;

  public TodoRepository_Factory(Provider<TodoDao> todoDaoProvider) {
    this.todoDaoProvider = todoDaoProvider;
  }

  @Override
  public TodoRepository get() {
    return newInstance(todoDaoProvider.get());
  }

  public static TodoRepository_Factory create(Provider<TodoDao> todoDaoProvider) {
    return new TodoRepository_Factory(todoDaoProvider);
  }

  public static TodoRepository newInstance(TodoDao todoDao) {
    return new TodoRepository(todoDao);
  }
}
