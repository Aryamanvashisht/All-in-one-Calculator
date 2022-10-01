package com.arya.allinonecalculator

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBCalc(val cntx:Context):SQLiteOpenHelper(cntx,"History of Calc",null,1){
    override fun onCreate(db: SQLiteDatabase?) {

        if (db != null) {
            db.execSQL("create table history( _id integer primary key autoincrement,equation text,answer text)")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

}