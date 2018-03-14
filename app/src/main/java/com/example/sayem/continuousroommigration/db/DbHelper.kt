package com.example.sayem.continuousroommigration.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.sayem.continuousroommigration.DB_NAME
import com.example.sayem.continuousroommigration.DB_VERSION

/**
 * Created by sayem on 3/14/2018.
 */
class DbHelper(context: Context?) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(CREATE_PROFILE_TABLE)
        db.execSQL(CREATE_PROFILE_SETTINGS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}