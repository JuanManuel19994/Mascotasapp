package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mascots.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_MASCOTA = "mascota";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_FOTO_URL = "foto_url";
    public static final String COLUMN_RATING = "rating";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_MASCOTA + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NOMBRE + " TEXT NOT NULL, " +
                    COLUMN_FOTO_URL + " TEXT NOT NULL, " +
                    COLUMN_RATING + " INTEGER NOT NULL DEFAULT 0);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_MASCOTA);
            onCreate(db);
        }
    }
}
