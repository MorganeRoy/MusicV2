package com.example.morganeroy.music.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alyss on 09/12/2016.
 */

public class SongBDDHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Song.db";

    public static final String TABLE_SONG = "Song";

    //ID
    public static final String COL_ID = "ID";
    public static final int NUM_COL_ID = 0;

    //Title
    public static final String COL_TITLE = "Title";
    public static final int NUM_COL_TITLE = 1;

    //Artist
    public static final String COL_ARTIST = "Artist";
    public static final int NUM_COL_ARTIST = 2;

    //Frequence
    public static final String COL_VALUE = "Value";
    public static final int NUM_COL_VALUE = 3;

    private static final String CREATE_DATABSE = "CREATE TABLE " + TABLE_SONG + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_TITLE + " TEXT NOT NULL, "
            + COL_ARTIST + " TEXT NOT NULL, "
            + COL_VALUE + " FLOAT NOT NULL);";

    private static final String DELETE_DATABASE = "DROP TABLE " + TABLE_SONG + ";";

    public SongBDDHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABSE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newVersion) {
        db.execSQL(DELETE_DATABASE);
        onCreate(db);
    }
}
