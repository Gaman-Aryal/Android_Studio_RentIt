package com.example.rentit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Databasehelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="USERS.db";
    public static final String TABLE_NAME ="OWNERINFO";

    public static final String Field1 ="OWNER_ID";
    public static final String Field2 ="OWNER_NAME";
    public static final String Field3 ="OWNER_USERNAME";
    public static final String Field4 ="OWNER_PASSWORD";
    public static final String Field5 ="OWNER_TEMPADDRESS";
    public static final String Field6 ="OWNER_PHONE_NUMBER";


    public Databasehelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+Field1 +" INTEGER PRIMARY KEY AUTOINCREMENT "+ Field2 +" TEXT "+ Field3 +" TEXT "+ Field4 +" TEXT "+ Field5 +" TEXT "+ Field6 +" TEXT ");
//        db.execSQL(String.format("create table %s %s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, ", TABLE_NAME, Field1, Field2, Field3, Field4, Field5, Field6));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
