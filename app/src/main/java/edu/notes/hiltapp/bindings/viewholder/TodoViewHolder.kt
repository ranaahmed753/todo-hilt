package edu.notes.hiltapp.bindings.viewholder

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.room.util.findColumnIndexBySuffix
import edu.notes.hiltapp.R
import edu.notes.hiltapp.room.entity.TodoItem

class TodoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var checkBox: CheckBox?=null
    var taskNameTextureView: TextView?=null
    init {
        checkBox=itemView.findViewById(R.id.checkbox)
        taskNameTextureView =itemView.findViewById(R.id.taskNameTextView)
    }

    fun bind(todoItem: TodoItem) {
        taskNameTextureView?.text = todoItem.taskName
        checkBox?.isChecked = todoItem.isCompleted

        checkBox?.setOnCheckedChangeListener { _, isChecked ->
            //onItemCheckedChangeListener?.invoke(todoItem, isChecked)
        }
    }


}