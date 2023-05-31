package edu.notes.hiltapp.mvvm.model

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.room.Query
import edu.notes.hiltapp.room.dao.TodoDao
import edu.notes.hiltapp.room.entity.TodoItem
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TodoRepository @Inject constructor(private val todoDao: TodoDao) {

    fun getTodoItems(): Flow<PagingData<TodoItem>> {
        return Pager(config = PagingConfig(pageSize = 20)) {
            todoDao.getTodoItems()
        }.flow
    }
    suspend fun addTodoItem(todoItem: TodoItem) {
        todoDao.addTodoItem(todoItem)
    }

    suspend fun updateTodoItem(todoItem: TodoItem) {
        todoDao.updateTodoItem(todoItem)
    }

    suspend fun deleteTodoItem(todoItem: TodoItem) {
        todoDao.deleteTodoItem(todoItem)
    }
}