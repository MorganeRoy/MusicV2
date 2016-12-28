package com.example.morganeroy.music.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.morganeroy.music.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alyss on 09/12/2016.
 */

public class SongBDD {
    private SQLiteDatabase dtb;
    private SongBDDHelper dtbHelper;

    public SongBDD(Context context) {
        dtbHelper = new SongBDDHelper(context);
    }

    public void open() {
        dtb = dtbHelper.getWritableDatabase();
    }

    public void close() {
        dtb.close();
    }

    public long insertSong(Song song) {
        Cursor c = dtb.rawQuery("SELECT * FROM " + SongBDDHelper.TABLE_SONG + " WHERE " + SongBDDHelper.COL_ID + "=" + song.getID() + ";", null);
        if (c.getCount() == 0) {
            ContentValues values = new ContentValues();
            values.put(SongBDDHelper.COL_ID, song.getID());
            values.put(SongBDDHelper.COL_TITLE, song.getTitle());
            values.put(SongBDDHelper.COL_ARTIST, song.getArtist());
            values.put(SongBDDHelper.COL_VALUE, song.getValue());
            return dtb.insert(SongBDDHelper.TABLE_SONG, null, values);
        }

        long idToUpdate = cursorToSong(c).getID();
        ContentValues values = new ContentValues();
        values.put(SongBDDHelper.COL_TITLE, song.getTitle());
        values.put(SongBDDHelper.COL_ARTIST, song.getArtist());
        values.put(SongBDDHelper.COL_VALUE, song.getValue());
        return dtb.update(SongBDDHelper.TABLE_SONG, values, SongBDDHelper.COL_ID + " = " + idToUpdate, null);
    }

    public List<Song> getAllSongs() {
        ArrayList<Song> allSongs = new ArrayList<>();
        Cursor c = dtb.rawQuery("SELECT * FROM " + SongBDDHelper.TABLE_SONG + ";", null);

        if (c.getCount() == 0) return allSongs;
        c.moveToFirst();
        do {
            allSongs.add(cursorToSong(c));
        } while (c.moveToNext());
        c.close();

        return allSongs;
    }

    private Song cursorToSong(Cursor c) {
        int id = c.getInt(SongBDDHelper.NUM_COL_ID);
        String title = c.getString(SongBDDHelper.NUM_COL_TITLE);
        String artist = c.getString(SongBDDHelper.NUM_COL_ARTIST);
        float value = c.getFloat(SongBDDHelper.NUM_COL_VALUE);

        return new Song(id, title, artist, value);
    }
}
