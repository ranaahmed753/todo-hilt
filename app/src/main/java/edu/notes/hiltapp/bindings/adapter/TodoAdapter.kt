package edu.notes.hiltapp.bindings.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import edu.notes.hiltapp.R
import edu.notes.hiltapp.bindings.viewholder.TodoViewHolder
import edu.notes.hiltapp.room.entity.TodoItem

class TodoAdapter : PagingDataAdapter<TodoItem, TodoViewHolder>(TodoDiffCallback()) {
    private var onItemCheckedChangeListener: ((TodoItem, Boolean) -> Unit)? = null

    fun setOnItemCheckedChangeListener(listener: (TodoItem, Boolean) -> Unit) {
        onItemCheckedChangeListener = listener
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val todoItem = getItem(position)
        todoItem?.let {
            holder.bind(todoItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    class TodoDiffCallback : DiffUtil.ItemCallback<TodoItem>() {
        override fun areItemsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem == newItem
        }
    }
}