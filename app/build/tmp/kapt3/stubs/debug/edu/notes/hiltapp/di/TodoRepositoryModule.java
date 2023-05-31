package edu.notes.hiltapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ledu/notes/hiltapp/di/TodoRepositoryModule;", "", "()V", "provideTodoRepository", "Ledu/notes/hiltapp/mvvm/model/TodoRepository;", "todoDao", "Ledu/notes/hiltapp/room/dao/TodoDao;", "app_debug"})
@dagger.Module()
public final class TodoRepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final edu.notes.hiltapp.di.TodoRepositoryModule INSTANCE = null;
    
    private TodoRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final edu.notes.hiltapp.mvvm.model.TodoRepository provideTodoRepository(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.dao.TodoDao todoDao) {
        return null;
    }
}