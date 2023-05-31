package edu.notes.hiltapp.ui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dagger.hilt.android.AndroidEntryPoint
import edu.notes.hiltapp.R
import edu.notes.hiltapp.bindings.adapter.TodoAdapter
import edu.notes.hiltapp.mvvm.viewmodel.TodoViewModel
import edu.notes.hiltapp.room.entity.TodoItem
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    @Inject
    lateinit var todoViewModel: TodoViewModel
    @Inject
    lateinit var todoAdapter: TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fab = findViewById(R.id.fab)
        fab.setOnClickListener {
            showAddTodoDialog()
        }
        setupViewModel()
        setupRecyclerView()
        //setupAddButton()
        observeTodoItems()

    }

    private fun setupViewModel() {
        //viewModel = ViewModelProvider(this).get(TodoViewModel::class.java)
    }

    private fun setupRecyclerView() {

        recyclerView = findViewById(R.id.todoRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = todoAdapter
        todoAdapter.setOnItemCheckedChangeListener { todoItem, isChecked ->
            val updatedTodoItem = todoItem.copy(isCompleted = isChecked)
            todoViewModel.updateTodoItem(updatedTodoItem)
        }

    }

    private fun observeTodoItems() {
        todoViewModel.todoItems.observe(this, { pagingData ->
            todoAdapter.submitData(lifecycle, pagingData)
        })
    }


    private fun showAddTodoDialog() {
        val dialog = Dialog(applicationContext)
        dialog.setContentView(R.layout.dialog_add_todo)
        val etTodoTitle: EditText = dialog.findViewById(R.id.etTodoTitle)
        val addTodoBtn: Button = dialog.findViewById(R.id.btnAdd)
        val cbIsCompleted: CheckBox = dialog.findViewById(R.id.cbIsCompleted)
        dialog.show()
        val title = etTodoTitle.text.toString()
        val isCompleted = cbIsCompleted.isChecked

        addTodoBtn.setOnClickListener {
            val newTodoItem = TodoItem(0,title,isCompleted)
            todoViewModel.addTodoItem(newTodoItem)
            dialog.dismiss()
        }
        }


    }

