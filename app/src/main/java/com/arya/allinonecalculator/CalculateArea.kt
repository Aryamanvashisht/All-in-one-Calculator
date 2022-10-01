package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateArea : AppCompatActivity() {

    val area_units = arrayOf(
        "Square meter(m²)",
        "Square decimeter(dm²)",
        "Square centimeter(cm²)",
        "Square kilometer(km²)",
        "Square millimeter(mm²)",
        "Hectare(ha)"
    )

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_area)
        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, area_units)
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
                                Toast.makeText(this, "m² to m²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "m² to dm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "m² to cm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "m² to km²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "m² to mm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "m² to ha", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 10000
                                unitCalc.text = r.toString()
                            }

                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, " dm² to m²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, " dm² to dm²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "dm² to cm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "dm² to km²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-8)
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "dm² to mm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "dm² to ha", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }

                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "cm² to m²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 10000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "cm² to dm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, " cm² to cm²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "cm² to km²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-10)
                                unitCalc.text = r.toString()
                            }
                            4 -> {

                                Toast.makeText(this, "cm² to mm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, " cm² to ha", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-8)
                                unitCalc.text = r.toString()
                            }
                        }
                    }


                    3 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "km² to m²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "km² to dm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+8)
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "km² to cm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+10)
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "km² to km²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "km² to mm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+12)
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "km² to ha", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    4 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "mm² to m²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "mm² to dm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 10000
                                unitCalc.text = r.toString()

                            }
                            2 -> {
                                Toast.makeText(this, "mm² to cm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100
                                unitCalc.text = r.toString()

                            }
                            3 -> {
                                Toast.makeText(this, "mm² to km²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-12)
                                unitCalc.text = r.toString()

                            }
                            4 -> {
                                Toast.makeText(this, "mm² to mm²", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "mm² to ha", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E-10)
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    5 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "ha to m²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "ha to dm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()

                            }
                            2 -> {
                                Toast.makeText(this, "ha to cm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100000000
                                unitCalc.text = r.toString()

                            }
                            3 -> {
                                Toast.makeText(this, "ha to km²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100
                                unitCalc.text = r.toString()

                            }
                            4 -> {
                                Toast.makeText(this, "ha to mm²", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+10)
                                unitCalc.text = r.toString()

                            }
                            5 -> {
                                Toast.makeText(this, "ha to nm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()

                            }
                        }
                    }
                }
            }
        }
    }
}