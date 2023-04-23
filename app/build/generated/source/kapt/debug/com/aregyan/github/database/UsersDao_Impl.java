package com.aregyan.github.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UsersDao_Impl implements UsersDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseUserListItem> __insertionAdapterOfDatabaseUserListItem;

  private final EntityInsertionAdapter<DatabaseUserDetails> __insertionAdapterOfDatabaseUserDetails;

  public UsersDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseUserListItem = new EntityInsertionAdapter<DatabaseUserListItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DatabaseUserListItem` (`id`,`avatar`,`username`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseUserListItem value) {
        stmt.bindLong(1, value.getId());
        if (value.getAvatar() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvatar());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsername());
        }
      }
    };
    this.__insertionAdapterOfDatabaseUserDetails = new EntityInsertionAdapter<DatabaseUserDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DatabaseUserDetails` (`user`,`avatar`,`name`,`userSince`,`location`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseUserDetails value) {
        if (value.getUser() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUser());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvatar());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getUserSince() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserSince());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLocation());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<DatabaseUserListItem> users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseUserListItem.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertUserDetails(final DatabaseUserDetails databaseUserDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseUserDetails.insert(databaseUserDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<DatabaseUserListItem>> getDatabaseUsers() {
    final String _sql = "select * from DatabaseUserListItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"DatabaseUserListItem"}, false, new Callable<List<DatabaseUserListItem>>() {
      @Override
      public List<DatabaseUserListItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final List<DatabaseUserListItem> _result = new ArrayList<DatabaseUserListItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseUserListItem _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            _item = new DatabaseUserListItem(_tmpId,_tmpAvatar,_tmpUsername);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<DatabaseUserDetails> getUserDetails(final String user) {
    final String _sql = "select * from DatabaseUserDetails WHERE user LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (user == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, user);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"DatabaseUserDetails"}, false, new Callable<DatabaseUserDetails>() {
      @Override
      public DatabaseUserDetails call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfUserSince = CursorUtil.getColumnIndexOrThrow(_cursor, "userSince");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final DatabaseUserDetails _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUser;
            if (_cursor.isNull(_cursorIndexOfUser)) {
              _tmpUser = null;
            } else {
              _tmpUser = _cursor.getString(_cursorIndexOfUser);
            }
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpUserSince;
            if (_cursor.isNull(_cursorIndexOfUserSince)) {
              _tmpUserSince = null;
            } else {
              _tmpUserSince = _cursor.getString(_cursorIndexOfUserSince);
            }
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            _result = new DatabaseUserDetails(_tmpUser,_tmpAvatar,_tmpName,_tmpUserSince,_tmpLocation);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
