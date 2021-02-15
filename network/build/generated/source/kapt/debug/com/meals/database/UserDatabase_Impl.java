package com.meals.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.meals.dao.HeaderDao;
import com.meals.dao.HeaderDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDatabase_Impl extends UserDatabase {
  private volatile HeaderDao _headerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `header` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `contentType` TEXT NOT NULL, `deviceId` TEXT NOT NULL, `deviceName` TEXT NOT NULL, `version` TEXT NOT NULL, `timeZone` TEXT NOT NULL, `operatingSystem` TEXT NOT NULL, `lat` TEXT NOT NULL, `fireBase` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e9754959987cb1e2ed099a6f80484fe3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `header`");
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
        final HashMap<String, TableInfo.Column> _columnsHeader = new HashMap<String, TableInfo.Column>(9);
        _columnsHeader.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("contentType", new TableInfo.Column("contentType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("deviceName", new TableInfo.Column("deviceName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("timeZone", new TableInfo.Column("timeZone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("operatingSystem", new TableInfo.Column("operatingSystem", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("lat", new TableInfo.Column("lat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeader.put("fireBase", new TableInfo.Column("fireBase", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHeader = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHeader = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHeader = new TableInfo("header", _columnsHeader, _foreignKeysHeader, _indicesHeader);
        final TableInfo _existingHeader = TableInfo.read(_db, "header");
        if (! _infoHeader.equals(_existingHeader)) {
          return new RoomOpenHelper.ValidationResult(false, "header(com.meals.entity.HeaderEntity).\n"
                  + " Expected:\n" + _infoHeader + "\n"
                  + " Found:\n" + _existingHeader);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e9754959987cb1e2ed099a6f80484fe3", "d0c76114eddc05d66d81fa2bee0b0376");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "header");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `header`");
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
  public HeaderDao mainDao() {
    if (_headerDao != null) {
      return _headerDao;
    } else {
      synchronized(this) {
        if(_headerDao == null) {
          _headerDao = new HeaderDao_Impl(this);
        }
        return _headerDao;
      }
    }
  }
}
