package edu.notes.hiltapp.mvvm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ledu/notes/hiltapp/mvvm/model/TodoRepository;", "", "todoDao", "Ledu/notes/hiltapp/room/dao/TodoDao;", "(Ledu/notes/hiltapp/room/dao/TodoDao;)V", "addTodoItem", "", "todoItem", "Ledu/notes/hiltapp/room/entity/TodoItem;", "(Ledu/notes/hiltapp/room/entity/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoItem", "getTodoItems", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "updateTodoItem", "app_debug"})
public final class TodoRepository {
    private final edu.notes.hiltapp.room.dao.TodoDao todoDao = null;
    
    @javax.inject.Inject()
    public TodoRepository(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.dao.TodoDao todoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<edu.notes.hiltapp.room.entity.TodoItem>> getTodoItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}