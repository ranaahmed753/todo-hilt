package edu.notes.hiltapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Ledu/notes/hiltapp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "todoAdapter", "Ledu/notes/hiltapp/bindings/adapter/TodoAdapter;", "getTodoAdapter", "()Ledu/notes/hiltapp/bindings/adapter/TodoAdapter;", "setTodoAdapter", "(Ledu/notes/hiltapp/bindings/adapter/TodoAdapter;)V", "todoViewModel", "Ledu/notes/hiltapp/mvvm/viewmodel/TodoViewModel;", "getTodoViewModel", "()Ledu/notes/hiltapp/mvvm/viewmodel/TodoViewModel;", "setTodoViewModel", "(Ledu/notes/hiltapp/mvvm/viewmodel/TodoViewModel;)V", "observeTodoItems", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "setupViewModel", "showAddTodoDialog", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    @javax.inject.Inject()
    public edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel todoViewModel;
    @javax.inject.Inject()
    public edu.notes.hiltapp.bindings.adapter.TodoAdapter todoAdapter;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel getTodoViewModel() {
        return null;
    }
    
    public final void setTodoViewModel(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.notes.hiltapp.bindings.adapter.TodoAdapter getTodoAdapter() {
        return null;
    }
    
    public final void setTodoAdapter(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.bindings.adapter.TodoAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void observeTodoItems() {
    }
    
    private final void showAddTodoDialog() {
    }
}