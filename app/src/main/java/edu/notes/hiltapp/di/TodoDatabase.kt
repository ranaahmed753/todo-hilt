package edu.notes.hiltapp.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.room.db.TodoDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoDatabaseModule {
    @Provides
    @Singleton
    fun provideTodoDatabase(application: Application): TodoDatabase {
        return Room.databaseBuilder(application, TodoDatabase::class.java, "todo_database")
            .build()
    }
}