package edu.notes.hiltapp.mvvm.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.notes.hiltapp.mvvm.model.TodoRepository
import edu.notes.hiltapp.room.entity.TodoItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoViewModel
  @Inject constructor(application: Application, private val repository: TodoRepository) : AndroidViewModel(application) {

    val todoItems: LiveData<PagingData<TodoItem>> = repository.getTodoItems().asLiveData()

    fun addTodoItem(todoItem: TodoItem) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addTodoItem(todoItem)
        }
    }

    fun deleteTodoItem(todoItem: TodoItem) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteTodoItem(todoItem)
        }
    }

    fun updateTodoItem(todoItem: TodoItem) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateTodoItem(todoItem)
        }
    }
}