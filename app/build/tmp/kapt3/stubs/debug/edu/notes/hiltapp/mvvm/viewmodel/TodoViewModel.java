package edu.notes.hiltapp.mvvm.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Ledu/notes/hiltapp/mvvm/viewmodel/TodoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "repository", "Ledu/notes/hiltapp/mvvm/model/TodoRepository;", "(Landroid/app/Application;Ledu/notes/hiltapp/mvvm/model/TodoRepository;)V", "todoItems", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Ledu/notes/hiltapp/room/entity/TodoItem;", "getTodoItems", "()Landroidx/lifecycle/LiveData;", "addTodoItem", "", "todoItem", "deleteTodoItem", "updateTodoItem", "app_debug"})
public final class TodoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final edu.notes.hiltapp.mvvm.model.TodoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<edu.notes.hiltapp.room.entity.TodoItem>> todoItems = null;
    
    @javax.inject.Inject()
    public TodoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.mvvm.model.TodoRepository repository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<edu.notes.hiltapp.room.entity.TodoItem>> getTodoItems() {
        return null;
    }
    
    public final void addTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem) {
    }
    
    public final void deleteTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem) {
    }
    
    public final void updateTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem) {
    }
}