package edu.notes.hiltapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ledu/notes/hiltapp/di/TodoViewModelModule;", "", "()V", "provideTodoViewModel", "Ledu/notes/hiltapp/mvvm/viewmodel/TodoViewModel;", "application", "Landroid/app/Application;", "repository", "Ledu/notes/hiltapp/mvvm/model/TodoRepository;", "app_debug"})
@dagger.Module()
public final class TodoViewModelModule {
    @org.jetbrains.annotations.NotNull()
    public static final edu.notes.hiltapp.di.TodoViewModelModule INSTANCE = null;
    
    private TodoViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel provideTodoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.mvvm.model.TodoRepository repository) {
        return null;
    }
}