package com.arya.allinonecalculator

import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.arya.allinonecalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder as ExpressionBuilder


class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    var eq1:String = ""
    var ans1:String = ""
    companion object {
        var equation: String = ""
        var answer: String = ""
    }

    //for dataBase handling
    lateinit var db: DBCalc  //refer to database
    lateinit var dbTable: SQLiteDatabase  // refer to table within the dataBase
    lateinit var dbInsert: ContentValues

    //**********************************************************************************************//

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return true
    }

    //instance of ActivityMainBinding use to access the widgets without using findViewById()...
    lateinit var binding: ActivityMainBinding
    private var ch: Char = '\u0000'


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.trigno -> {
                    startActivity(Intent(this, Mathsfunctions::class.java))
                }
                R.id.temp -> {
                    startActivity(Intent(this, UnitConverter::class.java))
                }
                R.id.history -> {
                    startActivity(Intent(this, HistoryOfCalc::class.java))
                }
                R.id.about -> {
                    startActivity(Intent(this,AboutApp::class.java))
                }
            }
            true
        }





        binding.preCalc.text = ""
        //hide the keyboard opening when click on EditText
        binding.displayEditText.showSoftInputOnFocus = false

        binding.ac.setOnClickListener {
            binding.displayEditText.setText("")
            binding.preCalc.setText("")
        }
        binding.backspace.setOnClickListener {
            val length = binding.displayEditText.length()
            if (length == 0) {
                binding.preCalc.text = ""
            }
            if (length > 0) {
                binding.displayEditText.setText(
                    binding.displayEditText.text.subSequence(
                        0,
                        length - 1
                    )
                )
            }
            binding.displayEditText.setSelection(binding.displayEditText.length())

        }
        binding.percentage.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                  binding.displayEditText.setText("Enter the value")
                  binding.displayEditText.setSelection(binding.displayEditText.length())
             }
            else {
                ch = '%'
                binding.displayEditText.append("%")
            }
        }
        binding.divide.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                binding.displayEditText.setText("Enter the value")
                binding.displayEditText.setSelection(binding.displayEditText.length())
            }
            else {
                ch = '/'
                binding.displayEditText.append("/")
            }
        }
        binding.btn7.setOnClickListener {
            binding.displayEditText.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.displayEditText.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.displayEditText.append("9")
        }
        binding.mul.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                binding.displayEditText.setText("Enter the value")
                binding.displayEditText.setSelection(binding.displayEditText.length())
            }
            else {
                ch = '*'
                binding.displayEditText.append("*")
            }
        }
        binding.btn4.setOnClickListener {
            binding.displayEditText.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.displayEditText.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.displayEditText.append("6")
        }
        binding.minus.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                binding.displayEditText.setText("Enter the value")
                binding.displayEditText.setSelection(binding.displayEditText.length())
            }
            else {
                ch = '-'
                binding.displayEditText.append("-")
            }
        }
        binding.btn1.setOnClickListener {
            binding.displayEditText.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.displayEditText.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.displayEditText.append("3")
        }
        binding.plus.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                binding.displayEditText.setText("Enter the value")
                binding.displayEditText.setSelection(binding.displayEditText.length())
            }
            else {
                ch = '+'
                binding.displayEditText.append("+")
            }
        }
        binding.btn0.setOnClickListener {
            binding.displayEditText.append("0")
        }
        binding.dot.setOnClickListener {
            val str = binding.displayEditText.text.toString()
            if( str == ""){
                binding.displayEditText.setText("Enter the value")
                binding.displayEditText.setSelection(binding.displayEditText.length())
            }
            else {
                binding.displayEditText.append(".")
            }
        }

         //Initailisation for dataBase Handling
         db = DBCalc(this) // initialised and refer to databse
         dbTable = db.writableDatabase // Able to inserting data inside the table
         dbInsert = ContentValues()  // help in inserting the data

         //***********************************//

        binding.equal.setOnClickListener {
            if (ch != '*' && ch != '/' && ch != '+' && ch != '-') {
                binding.preCalc.text = binding.displayEditText.text.toString()
                eq1 = binding.preCalc.text.toString()
            }
            val txt = binding.displayEditText.text.toString()
            val index = txt.indexOf(ch)
            val right: String = txt.substring(index + 1, txt.length)
            if (right.isEmpty() && ch != '%') { // check for the right operand
                binding.displayEditText.setSelection(binding.displayEditText.length())
            } else {

                val left = txt.substring(0, index)
                if (right.isEmpty() && ch == '%') {
                    val perc: Float = ((left.toInt())*0.01).toFloat()
                    binding.preCalc.text = binding.displayEditText.text.toString()
                    eq1 = binding.preCalc.text.toString()
                    binding.displayEditText.setText(perc.toString())
                    ans1 = perc.toString()
                    binding.displayEditText.setSelection(binding.displayEditText.length())
                } else {

                    //for evaluating the % expression
                    val str1 = txt
                    val str2 = "%"

                    if (str2 in str1) {
                        val pos = str1.indexOf("%") //position of % sign
                        val s1 = str1.substring(0, pos) //75
                        val s2 = str1.substring(pos + 1, str1.length) //3
                        val perc: Float = (s1.toInt() * s2.toInt()) / 100.toFloat()
                        binding.preCalc.text = binding.displayEditText.text.toString()
                        eq1 = binding.preCalc.text.toString()
                        binding.displayEditText.setText(perc.toString())
                        ans1 = perc.toString()
                        binding.displayEditText.setSelection(binding.displayEditText.length())
                    } else {
                        binding.preCalc.text = binding.displayEditText.text.toString()
                        eq1 = binding.preCalc.text.toString()
                        calculate()
                        binding.displayEditText.setSelection(binding.displayEditText.length())
                    }

                }

            }

            //
            if(eq1 != null && ans1 != null) {
                equation = eq1
                answer = ans1
            }
            //for inserting the data in dataBase
            dbInsert.put("equation", equation)
            dbInsert.put("answer", answer)
            //Toast.makeText(this, "Data Inserted in DataBase", Toast.LENGTH_SHORT).show()
            dbTable.insert("history", null, dbInsert)
        }

    }

    private fun calculate() {
        val value = binding.displayEditText.text.toString()
        val result = ExpressionBuilder(value).build().evaluate()
        val longResult = result.toLong()

        if (result == longResult.toDouble()) {
            binding.displayEditText.setText(result.toInt().toString())
            ans1 = result.toInt().toString()
        } else {
            binding.displayEditText.setText(String.format("%.2f", result))
            ans1 = String.format("%.2f",result)
        }


    }

//    override fun onDestroy() {
//        super.onDestroy()
//        cursor.close()
//        dbTable.close()
//    }
}