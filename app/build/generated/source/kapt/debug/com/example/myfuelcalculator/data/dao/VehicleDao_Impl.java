package com.example.myfuelcalculator.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myfuelcalculator.model.Vehicle;
import java.lang.Class;
import java.lang.Exception;
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
public final class VehicleDao_Impl implements VehicleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Vehicle> __insertionAdapterOfVehicle;

  private final EntityDeletionOrUpdateAdapter<Vehicle> __deletionAdapterOfVehicle;

  private final EntityDeletionOrUpdateAdapter<Vehicle> __updateAdapterOfVehicle;

  public VehicleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVehicle = new EntityInsertionAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `vehicles` (`vid`,`name`,`fuel`,`autonomy`,`image`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        stmt.bindLong(1, value.getVid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFuel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFuel());
        }
        stmt.bindDouble(4, value.getAutonomy());
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
      }
    };
    this.__deletionAdapterOfVehicle = new EntityDeletionOrUpdateAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `vehicles` WHERE `vid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        stmt.bindLong(1, value.getVid());
      }
    };
    this.__updateAdapterOfVehicle = new EntityDeletionOrUpdateAdapter<Vehicle>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `vehicles` SET `vid` = ?,`name` = ?,`fuel` = ?,`autonomy` = ?,`image` = ? WHERE `vid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Vehicle value) {
        stmt.bindLong(1, value.getVid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFuel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFuel());
        }
        stmt.bindDouble(4, value.getAutonomy());
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        stmt.bindLong(6, value.getVid());
      }
    };
  }

  @Override
  public Object insert(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVehicle.insert(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfVehicle.handle(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Vehicle vehicle, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfVehicle.handle(vehicle);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Vehicle>> getAllVehicles() {
    final String _sql = "SELECT * FROM vehicles ORDER BY vid DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"vehicles"}, false, new Callable<List<Vehicle>>() {
      @Override
      public List<Vehicle> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfVid = CursorUtil.getColumnIndexOrThrow(_cursor, "vid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFuel = CursorUtil.getColumnIndexOrThrow(_cursor, "fuel");
          final int _cursorIndexOfAutonomy = CursorUtil.getColumnIndexOrThrow(_cursor, "autonomy");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<Vehicle> _result = new ArrayList<Vehicle>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Vehicle _item;
            final int _tmpVid;
            _tmpVid = _cursor.getInt(_cursorIndexOfVid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFuel;
            if (_cursor.isNull(_cursorIndexOfFuel)) {
              _tmpFuel = null;
            } else {
              _tmpFuel = _cursor.getString(_cursorIndexOfFuel);
            }
            final double _tmpAutonomy;
            _tmpAutonomy = _cursor.getDouble(_cursorIndexOfAutonomy);
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new Vehicle(_tmpVid,_tmpName,_tmpFuel,_tmpAutonomy,_tmpImage);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
