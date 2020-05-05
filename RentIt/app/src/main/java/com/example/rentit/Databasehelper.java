package com.example.rentit;


import android.content.ContentValues;
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
    public static final String Field4 = "OWNER_PHONE_NUMBER";
    public static final String Field5 = "OWNER_GENDER";
    public static final String Field6 = "OWNER_PASSWORD";
    public static final String Field7 = "OWNER_ADDRESS";


    public Databasehelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + Field1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + Field2 + " TEXT," + Field3 + " Text," + Field4 + " Text," + Field5 + " Text," + Field6 + " Text," + Field7 + " Text)");
//        db.execSQL(String.format("create table %s %s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, ", TABLE_NAME, Field1, Field2, Field3, Field4, Field5, Field6));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String email, String phone, String gender, String password, String location) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Field2, name);
        contentValues.put(Field3, email);
        contentValues.put(Field4, phone);
        contentValues.put(Field5, gender);
        contentValues.put(Field6, password);
        contentValues.put(Field7, location);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;


    }


}
