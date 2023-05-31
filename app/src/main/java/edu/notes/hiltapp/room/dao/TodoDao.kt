package edu.notes.hiltapp.room.dao

import androidx.paging.PagingSource
import androidx.room.*
import edu.notes.hiltapp.room.entity.TodoItem

@Dao
interface TodoDao {
    @Insert
    suspend fun addTodoItem(todoItem: TodoItem)

    @Query("SELECT * FROM todo_items")
    fun getTodoItems(): PagingSource<Int, TodoItem>

    @Update
    suspend fun updateTodoItem(todoItem: TodoItem)

    @Delete
    suspend fun deleteTodoItem(todoItem: TodoItem)
}