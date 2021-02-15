package com.meals.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.meals.entity.HeaderEntity;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HeaderDao_Impl implements HeaderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HeaderEntity> __insertionAdapterOfHeaderEntity;

  private final EntityDeletionOrUpdateAdapter<HeaderEntity> __updateAdapterOfHeaderEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HeaderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHeaderEntity = new EntityInsertionAdapter<HeaderEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `header` (`id`,`contentType`,`deviceId`,`deviceName`,`version`,`timeZone`,`operatingSystem`,`lat`,`fireBase`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HeaderEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getContentType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContentType());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDeviceId());
        }
        if (value.getDeviceName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeviceName());
        }
        if (value.getVersion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getVersion());
        }
        if (value.getTimeZone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeZone());
        }
        if (value.getOperatingSystem() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOperatingSystem());
        }
        if (value.getLat() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLat());
        }
        if (value.getFireBase() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFireBase());
        }
      }
    };
    this.__updateAdapterOfHeaderEntity = new EntityDeletionOrUpdateAdapter<HeaderEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `header` SET `id` = ?,`contentType` = ?,`deviceId` = ?,`deviceName` = ?,`version` = ?,`timeZone` = ?,`operatingSystem` = ?,`lat` = ?,`fireBase` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HeaderEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getContentType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContentType());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDeviceId());
        }
        if (value.getDeviceName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeviceName());
        }
        if (value.getVersion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getVersion());
        }
        if (value.getTimeZone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeZone());
        }
        if (value.getOperatingSystem() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOperatingSystem());
        }
        if (value.getLat() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLat());
        }
        if (value.getFireBase() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFireBase());
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM header";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final HeaderEntity header, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHeaderEntity.insert(header);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateAsync(final HeaderEntity header, final Continuation<? super Integer> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfHeaderEntity.handle(header);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getHeader(final Continuation<? super HeaderEntity> p0) {
    final String _sql = "SELECT * from header";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<HeaderEntity>() {
      @Override
      public HeaderEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfContentType = CursorUtil.getColumnIndexOrThrow(_cursor, "contentType");
          final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
          final int _cursorIndexOfDeviceName = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceName");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfTimeZone = CursorUtil.getColumnIndexOrThrow(_cursor, "timeZone");
          final int _cursorIndexOfOperatingSystem = CursorUtil.getColumnIndexOrThrow(_cursor, "operatingSystem");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfFireBase = CursorUtil.getColumnIndexOrThrow(_cursor, "fireBase");
          final HeaderEntity _result;
          if(_cursor.moveToFirst()) {
            _result = new HeaderEntity();
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
            final String _tmpContentType;
            _tmpContentType = _cursor.getString(_cursorIndexOfContentType);
            _result.setContentType(_tmpContentType);
            final String _tmpDeviceId;
            _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
            _result.setDeviceId(_tmpDeviceId);
            final String _tmpDeviceName;
            _tmpDeviceName = _cursor.getString(_cursorIndexOfDeviceName);
            _result.setDeviceName(_tmpDeviceName);
            final String _tmpVersion;
            _tmpVersion = _cursor.getString(_cursorIndexOfVersion);
            _result.setVersion(_tmpVersion);
            final String _tmpTimeZone;
            _tmpTimeZone = _cursor.getString(_cursorIndexOfTimeZone);
            _result.setTimeZone(_tmpTimeZone);
            final String _tmpOperatingSystem;
            _tmpOperatingSystem = _cursor.getString(_cursorIndexOfOperatingSystem);
            _result.setOperatingSystem(_tmpOperatingSystem);
            final String _tmpLat;
            _tmpLat = _cursor.getString(_cursorIndexOfLat);
            _result.setLat(_tmpLat);
            final String _tmpFireBase;
            _tmpFireBase = _cursor.getString(_cursorIndexOfFireBase);
            _result.setFireBase(_tmpFireBase);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
