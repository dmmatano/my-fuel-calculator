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
import com.example.myfuelcalculator.model.FuelCost;
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
public final class FuelCostDao_Impl implements FuelCostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FuelCost> __insertionAdapterOfFuelCost;

  private final EntityDeletionOrUpdateAdapter<FuelCost> __deletionAdapterOfFuelCost;

  private final EntityDeletionOrUpdateAdapter<FuelCost> __updateAdapterOfFuelCost;

  public FuelCostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFuelCost = new EntityInsertionAdapter<FuelCost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `costs` (`cid`,`name`,`total_cost`,`vehicle`,`fuel`,`total_distance`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FuelCost value) {
        stmt.bindLong(1, value.getCid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getTotalCost());
        if (value.getVehicle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getVehicle());
        }
        if (value.getFuel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFuel());
        }
        stmt.bindDouble(6, value.getTotalDistance());
      }
    };
    this.__deletionAdapterOfFuelCost = new EntityDeletionOrUpdateAdapter<FuelCost>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `costs` WHERE `cid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FuelCost value) {
        stmt.bindLong(1, value.getCid());
      }
    };
    this.__updateAdapterOfFuelCost = new EntityDeletionOrUpdateAdapter<FuelCost>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `costs` SET `cid` = ?,`name` = ?,`total_cost` = ?,`vehicle` = ?,`fuel` = ?,`total_distance` = ? WHERE `cid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FuelCost value) {
        stmt.bindLong(1, value.getCid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindDouble(3, value.getTotalCost());
        if (value.getVehicle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getVehicle());
        }
        if (value.getFuel() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFuel());
        }
        stmt.bindDouble(6, value.getTotalDistance());
        stmt.bindLong(7, value.getCid());
      }
    };
  }

  @Override
  public Object insert(final FuelCost cost, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFuelCost.insert(cost);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final FuelCost cost, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFuelCost.handle(cost);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final FuelCost cost, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFuelCost.handle(cost);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<FuelCost>> getAllCosts() {
    final String _sql = "SELECT * FROM costs ORDER BY cid DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"costs"}, false, new Callable<List<FuelCost>>() {
      @Override
      public List<FuelCost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCid = CursorUtil.getColumnIndexOrThrow(_cursor, "cid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTotalCost = CursorUtil.getColumnIndexOrThrow(_cursor, "total_cost");
          final int _cursorIndexOfVehicle = CursorUtil.getColumnIndexOrThrow(_cursor, "vehicle");
          final int _cursorIndexOfFuel = CursorUtil.getColumnIndexOrThrow(_cursor, "fuel");
          final int _cursorIndexOfTotalDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "total_distance");
          final List<FuelCost> _result = new ArrayList<FuelCost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FuelCost _item;
            final int _tmpCid;
            _tmpCid = _cursor.getInt(_cursorIndexOfCid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final double _tmpTotalCost;
            _tmpTotalCost = _cursor.getDouble(_cursorIndexOfTotalCost);
            final String _tmpVehicle;
            if (_cursor.isNull(_cursorIndexOfVehicle)) {
              _tmpVehicle = null;
            } else {
              _tmpVehicle = _cursor.getString(_cursorIndexOfVehicle);
            }
            final String _tmpFuel;
            if (_cursor.isNull(_cursorIndexOfFuel)) {
              _tmpFuel = null;
            } else {
              _tmpFuel = _cursor.getString(_cursorIndexOfFuel);
            }
            final double _tmpTotalDistance;
            _tmpTotalDistance = _cursor.getDouble(_cursorIndexOfTotalDistance);
            _item = new FuelCost(_tmpCid,_tmpName,_tmpTotalCost,_tmpVehicle,_tmpFuel,_tmpTotalDistance);
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
