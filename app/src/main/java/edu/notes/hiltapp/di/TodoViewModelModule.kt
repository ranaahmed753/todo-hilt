package edu.notes.hiltapp.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import edu.notes.hiltapp.mvvm.model.TodoRepository
import edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel
import edu.notes.hiltapp.ui.TodoApplication
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object TodoViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideTodoViewModel(
        application: Application,
        repository: TodoRepository
    ): TodoViewModel {
        return TodoViewModel(application, repository)
    }
}