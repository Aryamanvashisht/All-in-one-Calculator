package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateTemp : AppCompatActivity() {
    private val temp_units =
        arrayOf("Degree Celsius(°C)", "Degree Fahrenheit(°F)", "Kelvin(K)")

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_temp)

        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, temp_units)
        obj.setAdapter(arrAdpt)
        auto_complete_text2.setAdapter(arrAdpt)

        //first drop-down
        obj.setOnItemClickListener { adapterView, view, i, l ->
            var1 = i
            //Toast.makeText(this,"$i",Toast.LENGTH_SHORT).show()
        }
        //second drop-down
        auto_complete_text2.setOnItemClickListener { adapterView, view, i, l ->
            var2 = i
            //Toast.makeText(this,"$i",Toast.LENGTH_SHORT).show()
        }

        cal.setOnClickListener {
            if (unitEdit.text.toString() == "") {
                unitCalc.setText("Enter value first")
            } else {
                when (var1) {

                    0 -> {

                        when (var2) {
                            0 -> {
                                Toast.makeText(this, "°C to °C", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "°C to °F", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = (c * 9/5) + 32
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "°C to K", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c + 273.15
                                unitCalc.text = r.toString()
                            }

                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "°F to °C", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = (c-32)* 5/9
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "°F to °F", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "°F to K", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = (c-32)*5/9 + 273.15
                                unitCalc.text = r.toString()
                            }

                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "K to °C", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c-273.15
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "K to °F", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = (c - 273.15)* 9/5 + 32
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "K to K", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                        }

                    }

                }
            }
        }


    }
}