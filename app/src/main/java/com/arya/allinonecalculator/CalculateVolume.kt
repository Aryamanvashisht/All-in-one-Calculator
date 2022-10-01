package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateVolume : AppCompatActivity() {

    val vol_units = arrayOf(
        "Cubic meter(m³)",
        "Cubic centimeter(cm³)",
        "Cubic decimeter(dm³)",
        "Liter(l)",
        "Milliliter(ml)",
        "Cubic millimeter(mm³)"
    )

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_volume)
        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, vol_units)
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
                                Toast.makeText(this, "m³ to m³", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "m³ to cm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "m³ to dm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "m³ to l", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "m³ to ml", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "m³ to mm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+9)
                                unitCalc.text = r.toString()
                            }

                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "cm³ to m³", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "cm³ to cm³", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "cm³ to dm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "cm³ to l", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "cm³ to ml", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "cm³ to mm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "dm³ to m³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "dm³ to cm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "dm³ to dm³", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "dm² to l", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1
                                unitCalc.text = r.toString()
                            }
                            4 -> {

                                Toast.makeText(this, "dm³ to ml", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "dm³ to mm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+6)
                                unitCalc.text = r.toString()
                            }
                        }
                    }


                    3 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "l to m³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "l to cm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "l to dm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "l to l", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "l to ml", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "l to mm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+6)
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    4 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "ml to m³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "ml to cm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1
                                unitCalc.text = r.toString()

                            }
                            2 -> {
                                Toast.makeText(this, "ml to dm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()

                            }
                            3 -> {
                                Toast.makeText(this, "ml to l", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()

                            }
                            4 -> {
                                Toast.makeText(this, "ml to ml", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "ml to mm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * 1000
                                unitCalc.text = r.toString()

                            }

                        }

                    }

                    5 -> {
                        when (var2) {
                            0 -> {
                                Toast.makeText(this, "mm³ to m³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E-9)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "mm³ to cm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "mm³ to dm³", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "mm³ to l", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "mm³ to ml", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "mm³ to mm³", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                        }
                    }
                }
            }
        }
    }
}