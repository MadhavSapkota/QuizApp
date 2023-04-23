package com.aregyan.github.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UsersDatabase_Impl extends UsersDatabase {
  private volatile UsersDao _usersDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DatabaseUserListItem` (`id` INTEGER NOT NULL, `avatar` TEXT NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DatabaseUserDetails` (`user` TEXT NOT NULL, `avatar` TEXT NOT NULL, `name` TEXT NOT NULL, `userSince` TEXT NOT NULL, `location` TEXT NOT NULL, PRIMARY KEY(`user`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '662e4ee99b322c9f0d112513f43e00a7')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DatabaseUserListItem`");
        _db.execSQL("DROP TABLE IF EXISTS `DatabaseUserDetails`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDatabaseUserListItem = new HashMap<String, TableInfo.Column>(3);
        _columnsDatabaseUserListItem.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserListItem.put("avatar", new TableInfo.Column("avatar", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserListItem.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDatabaseUserListItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDatabaseUserListItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDatabaseUserListItem = new TableInfo("DatabaseUserListItem", _columnsDatabaseUserListItem, _foreignKeysDatabaseUserListItem, _indicesDatabaseUserListItem);
        final TableInfo _existingDatabaseUserListItem = TableInfo.read(_db, "DatabaseUserListItem");
        if (! _infoDatabaseUserListItem.equals(_existingDatabaseUserListItem)) {
          return new RoomOpenHelper.ValidationResult(false, "DatabaseUserListItem(com.aregyan.github.database.DatabaseUserListItem).\n"
                  + " Expected:\n" + _infoDatabaseUserListItem + "\n"
                  + " Found:\n" + _existingDatabaseUserListItem);
        }
        final HashMap<String, TableInfo.Column> _columnsDatabaseUserDetails = new HashMap<String, TableInfo.Column>(5);
        _columnsDatabaseUserDetails.put("user", new TableInfo.Column("user", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserDetails.put("avatar", new TableInfo.Column("avatar", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserDetails.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserDetails.put("userSince", new TableInfo.Column("userSince", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseUserDetails.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDatabaseUserDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDatabaseUserDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDatabaseUserDetails = new TableInfo("DatabaseUserDetails", _columnsDatabaseUserDetails, _foreignKeysDatabaseUserDetails, _indicesDatabaseUserDetails);
        final TableInfo _existingDatabaseUserDetails = TableInfo.read(_db, "DatabaseUserDetails");
        if (! _infoDatabaseUserDetails.equals(_existingDatabaseUserDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "DatabaseUserDetails(com.aregyan.github.database.DatabaseUserDetails).\n"
                  + " Expected:\n" + _infoDatabaseUserDetails + "\n"
                  + " Found:\n" + _existingDatabaseUserDetails);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "662e4ee99b322c9f0d112513f43e00a7", "869536feda74eea87722edbc3e76ac5f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DatabaseUserListItem","DatabaseUserDetails");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DatabaseUserListItem`");
      _db.execSQL("DELETE FROM `DatabaseUserDetails`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UsersDao.class, UsersDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UsersDao getUsersDao() {
    if (_usersDao != null) {
      return _usersDao;
    } else {
      synchronized(this) {
        if(_usersDao == null) {
          _usersDao = new UsersDao_Impl(this);
        }
        return _usersDao;
      }
    }
  }
}
