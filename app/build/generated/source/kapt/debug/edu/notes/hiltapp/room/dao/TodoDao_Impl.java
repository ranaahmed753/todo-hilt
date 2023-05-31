package edu.notes.hiltapp.room.dao;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import edu.notes.hiltapp.room.entity.TodoItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoDao_Impl implements TodoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoItem> __insertionAdapterOfTodoItem;

  private final EntityDeletionOrUpdateAdapter<TodoItem> __deletionAdapterOfTodoItem;

  private final EntityDeletionOrUpdateAdapter<TodoItem> __updateAdapterOfTodoItem;

  public TodoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoItem = new EntityInsertionAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `todo_items` (`id`,`taskName`,`isCompleted`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getTaskName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskName());
        }
        final int _tmp = value.isCompleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
    this.__deletionAdapterOfTodoItem = new EntityDeletionOrUpdateAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `todo_items` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTodoItem = new EntityDeletionOrUpdateAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `todo_items` SET `id` = ?,`taskName` = ?,`isCompleted` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getTaskName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskName());
        }
        final int _tmp = value.isCompleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object addTodoItem(final TodoItem todoItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTodoItem.insert(todoItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTodoItem(final TodoItem todoItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTodoItem.handle(todoItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTodoItem(final TodoItem todoItem,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTodoItem.handle(todoItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, TodoItem> getTodoItems() {
    final String _sql = "SELECT * FROM todo_items";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<TodoItem>(_statement, __db, "todo_items") {
      @Override
      protected List<TodoItem> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfTaskName = CursorUtil.getColumnIndexOrThrow(cursor, "taskName");
        final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(cursor, "isCompleted");
        final List<TodoItem> _result = new ArrayList<TodoItem>(cursor.getCount());
        while(cursor.moveToNext()) {
          final TodoItem _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final String _tmpTaskName;
          if (cursor.isNull(_cursorIndexOfTaskName)) {
            _tmpTaskName = null;
          } else {
            _tmpTaskName = cursor.getString(_cursorIndexOfTaskName);
          }
          final boolean _tmpIsCompleted;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfIsCompleted);
          _tmpIsCompleted = _tmp != 0;
          _item = new TodoItem(_tmpId,_tmpTaskName,_tmpIsCompleted);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
