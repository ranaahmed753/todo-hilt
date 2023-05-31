package edu.notes.hiltapp.bindings.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u00020\b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ledu/notes/hiltapp/bindings/adapter/TodoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Ledu/notes/hiltapp/room/entity/TodoItem;", "Ledu/notes/hiltapp/bindings/viewholder/TodoViewHolder;", "()V", "onItemCheckedChangeListener", "Lkotlin/Function2;", "", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemCheckedChangeListener", "listener", "TodoDiffCallback", "app_debug"})
public final class TodoAdapter extends androidx.paging.PagingDataAdapter<edu.notes.hiltapp.room.entity.TodoItem, edu.notes.hiltapp.bindings.viewholder.TodoViewHolder> {
    private kotlin.jvm.functions.Function2<? super edu.notes.hiltapp.room.entity.TodoItem, ? super java.lang.Boolean, kotlin.Unit> onItemCheckedChangeListener;
    
    public TodoAdapter() {
        super(null, null, null);
    }
    
    public final void setOnItemCheckedChangeListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super edu.notes.hiltapp.room.entity.TodoItem, ? super java.lang.Boolean, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    edu.notes.hiltapp.bindings.viewholder.TodoViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public edu.notes.hiltapp.bindings.viewholder.TodoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Ledu/notes/hiltapp/bindings/adapter/TodoAdapter$TodoDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ledu/notes/hiltapp/room/entity/TodoItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class TodoDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<edu.notes.hiltapp.room.entity.TodoItem> {
        
        public TodoDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        edu.notes.hiltapp.room.entity.TodoItem oldItem, @org.jetbrains.annotations.NotNull()
        edu.notes.hiltapp.room.entity.TodoItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        edu.notes.hiltapp.room.entity.TodoItem oldItem, @org.jetbrains.annotations.NotNull()
        edu.notes.hiltapp.room.entity.TodoItem newItem) {
            return false;
        }
    }
}