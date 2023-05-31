package edu.notes.hiltapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import edu.notes.hiltapp.bindings.adapter.TodoAdapter

@Module
@InstallIn(ActivityComponent::class)
object AdapterModule {
    @Provides
    fun provideTodoAdapter(): TodoAdapter {
        return TodoAdapter()
    }
}