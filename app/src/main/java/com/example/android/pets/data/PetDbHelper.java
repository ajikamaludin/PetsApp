package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by aji on 19/07/17.
 */

public class PetDbHelper extends SQLiteOpenHelper{

    //CREATE TABLE pets (_id INTEGER PRIMARY KEY AUTOINCREMENT,
    // name TEXT NOT NULL,
    // breed TEXT,
    // gender INTEGER NOT NULL,
    // weight INTEGER NOT NULL DEFAULT 0);
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                    PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                    PetEntry.COLUMN_PET_BREED + " TEXT, "+
                    PetEntry.COLUMN_PETS_GENDER + " INTEGER NOT NULL, " +
                    PetEntry.COLUMN_PETS_WEIGHT + " INTEGER NOT NULL DEFAULT 0"
                    + ")";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PetsReader.db";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

}
