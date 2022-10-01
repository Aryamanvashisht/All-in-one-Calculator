package com.arya.allinonecalculator

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import android.widget.Toast

class HistoryOfCalc : AppCompatActivity() {
    lateinit var db: DBCalc  //refer to database
    lateinit var dbTable: SQLiteDatabase  // refer to table within the dataBase
    lateinit var cursor: Cursor  // responsible for fetching the data from dataBase
    lateinit var dbInsert: ContentValues // inserting tuples in the table
    lateinit var lst_View:ListView

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.symbol, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.deleteButton -> {
                if(cursor.moveToFirst() == true) {
                    deleteFun()
                    Toast.makeText(this,"History cleared!!",Toast.LENGTH_SHORT).show()
                }
            }
            android.R.id.home -> onBackPressed()
        }
        return true
    }


    private fun deleteFun() {
         dbTable.execSQL("delete from history")
          db.close()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_of_calc)

        lst_View = findViewById(R.id.lstView)

        db = DBCalc(this) // initialised and refer to databse
        dbTable = db.writableDatabase // inserting data inside the table
        dbInsert = ContentValues()
        cursor = dbTable.query(
            "history",
            arrayOf("_id","equation","answer"),
            null,
            null,
            null,
            null,
            null,
            null
        )

        var cursorAdapter = SimpleCursorAdapter(
            this@HistoryOfCalc,R.layout.row, cursor, arrayOf("equation","answer"), intArrayOf(R.id.equ,R.id.ans), 0)

        lst_View.adapter = cursorAdapter

    }

//    override fun onDestroy() {
//        super.onDestroy()
//        cursor.close()
//        dbTable.close()
//    }
}