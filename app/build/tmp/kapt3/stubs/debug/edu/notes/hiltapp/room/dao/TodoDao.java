package edu.notes.hiltapp.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Ledu/notes/hiltapp/room/dao/TodoDao;", "", "addTodoItem", "", "todoItem", "Ledu/notes/hiltapp/room/entity/TodoItem;", "(Ledu/notes/hiltapp/room/entity/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTodoItem", "getTodoItems", "Landroidx/paging/PagingSource;", "", "updateTodoItem", "app_debug"})
public abstract interface TodoDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_items")
    public abstract androidx.paging.PagingSource<java.lang.Integer, edu.notes.hiltapp.room.entity.TodoItem> getTodoItems();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteTodoItem(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.room.entity.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}