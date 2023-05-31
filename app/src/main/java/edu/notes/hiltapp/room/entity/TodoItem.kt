package edu.notes.hiltapp.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_items")
data class TodoItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val taskName: String,
    val isCompleted: Boolean = false
)