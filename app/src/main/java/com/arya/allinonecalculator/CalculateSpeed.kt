package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateSpeed : AppCompatActivity() {
    val speed_units = arrayOf("Speed of light(c)","kilometer/second(km/s)","Mile/hour(mph)","Inch/second(in/s)","Meter/second(m/s)","kilometer/hour(km/h)")

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_speed)
        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, speed_units)
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
                                Toast.makeText(this, "c to c", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "c to km/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 299792.458
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "c to mph", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*760616629
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "c to in/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c *(1.18E-10)
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "c to m/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 299792458
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "c to km/h", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (1.07925285E+9)
                                unitCalc.text = r.toString()
                            }

                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "km/s to c", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (3.33564E-6)
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "km/s to km/s", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "km/s to mph", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c* 2236.94
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "km/s to in/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*39370.1
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "km/s to m/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "km/s to km/h", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 3600
                                unitCalc.text = r.toString()
                            }

                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "mph to c", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c *(1.49116E-9)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "mph to km/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/2237
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "mph to mph", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "mph to in/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 17.6
                                unitCalc.text = r.toString()
                            }
                            4 -> {

                                Toast.makeText(this, "mph to m/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 0.44704
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "mph to km/h", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1.609
                                unitCalc.text = r.toString()
                            }
                        }
                    }


                    3 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "in/s to c", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(8.4725E-11)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "in/s to km/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (2.54E-5)
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "in/s to mph", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 0.0568182
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "in/s to in/s", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "in/s to m/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 0.0254
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "in/s to km/h", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c *0.09144
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    4 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "m/s to c", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * (3.33564E-9)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "m/s to km/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 0.001
                                unitCalc.text = r.toString()

                            }
                            2 -> {
                                Toast.makeText(this, "m/s to mph", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c *2.23694
                                unitCalc.text = r.toString()

                            }
                            3 -> {
                                Toast.makeText(this, "m/s to in/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*39.3701
                                unitCalc.text = r.toString()

                            }
                            4 -> {
                                Toast.makeText(this, "m/s to m/s", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "m/s to km/h", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * 3.6
                                unitCalc.text = r.toString()

                            }

                        }

                    }

                    5 -> {
                        when (var2) {
                            0 -> {
                                Toast.makeText(this, "km/h to c", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * (9.26567E-10)
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "km/h to km/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c*0.000277778
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, "km/h to mph", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c *0.277778
                                unitCalc.text = r.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "km/h to in/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c * 10.9361
                                unitCalc.text = r.toString()
                            }
                            4 -> {
                                Toast.makeText(this, "km/h to m/s", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c*0.277778
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "km/h to km/h", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                        }
                    }
                }
            }
        }


    }
}