package edu.notes.hiltapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.mvvm.model.TodoRepository
import edu.notes.hiltapp.room.dao.TodoDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoRepositoryModule {
    @Provides
    @Singleton
    fun provideTodoRepository(todoDao: TodoDao): TodoRepository {
        return TodoRepository(todoDao)
    }
}