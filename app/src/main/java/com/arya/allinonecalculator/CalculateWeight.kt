package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateWeight : AppCompatActivity() {
    val weight_units =
        arrayOf("Gram(g)", "Microgram(µg)", "Quintal(q)", "Ton(t)", "Miligram(mg)", "Kilogram (kg)")

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_weight)
        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, weight_units)
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
                                Toast.makeText(this, "g to g", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "g to µg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "g to q", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100000
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "g to t", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 907200
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "g to mg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "g to kg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }

                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "µg to g", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "µg to µg", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "µg to q", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-11)
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "µg to t", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1.10231E-12)
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "µg to mg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "µg to kg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-9)
                                unitCalc.text = r.toString()
                            }

                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "q to g", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "q to µg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+11)
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "q to q", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "q to t", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 9.072
                                unitCalc.text = r.toString()
                            }
                            4 -> {

                                Toast.makeText(this, "q to mg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E+8)
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "q to kg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100
                                unitCalc.text = r.toString()
                            }
                        }
                    }


                    3 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "t to g", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 907200
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "t to µg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (9.072E+11)
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "t to q", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 9.072
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "t to t", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "t to mg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (9.072E+8
                                        )
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "t to kg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 907.2
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    4 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "mg to g", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 1000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "mg to µg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()

                            }
                            2 -> {
                                Toast.makeText(this, "mg to q", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1E-8)
                                unitCalc.text = r.toString()

                            }
                            3 -> {
                                Toast.makeText(this, "mg to t", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1.10231E-9)
                                unitCalc.text = r.toString()

                            }
                            4 -> {
                                Toast.makeText(this, "mg to mg", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "mg to kg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E-6)
                                unitCalc.text = r.toString()

                            }

                        }

                    }

                    5 -> {
                        when (var2) {
                            0 -> {
                                Toast.makeText(this, "kg to g", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "kg to µg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (1E+9)
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "kg to q", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c / 100
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "kg to t", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c / 907.2
                                unitCalc.text = r.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "kg to mg", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "kg to kg", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                        }
                    }
                }
            }
        }


    }
}