package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculate_length.*

class CalculateLength : AppCompatActivity() {

    val units1 = arrayOf(
        "Kilometer(km)",
        "Centimeter(cm)",
        "Meter(m)",
        "Decimeter(dm)",
        "Millimeter(mm)",
        "Nanometer(nm)",
        "Micrometer(μm)"
    )

    lateinit var obj: AutoCompleteTextView
    lateinit var arrAdpt: ArrayAdapter<String>
    var var1: Int = 0
    var var2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_length)

        obj = findViewById(R.id.auto_complete_text1)
        arrAdpt = ArrayAdapter<String>(this, R.layout.listitems, units1)
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
                                Toast.makeText(this, " Both km", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            1 -> {
                                Toast.makeText(this, "km to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 100000
                                unitCalc.text = r.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "km to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "km to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "km to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "km to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000000000
                                unitCalc.text = r.toString()
                            }

                            6 -> {
                                Toast.makeText(this, "km to μm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 1000000000
                                unitCalc.text = r.toString()
                            }
                        }

                    }

                    1 -> {
                        when (var2) {

                            0 -> {
                                Toast.makeText(this, " cm to km", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                                unitCalc.text = unitEdit.text.toString()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100000
                                unitCalc.text = r.toString()
                            }

                            1 -> {
                                Toast.makeText(this, " cm to cm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }

                            2 -> {
                                Toast.makeText(this, "cm to m", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 100
                                unitCalc.text = r.toString()
                            }

                            3 -> {
                                Toast.makeText(this, "cm to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c / 10
                                unitCalc.text = r.toString()
                            }

                            4 -> {
                                Toast.makeText(this, "cm to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10
                                unitCalc.text = r.toString()
                            }

                            5 -> {
                                Toast.makeText(this, "cm to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000000
                                unitCalc.text = r.toString()
                            }

                            6 -> {
                                Toast.makeText(this, "cm to μm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c * 10000
                                unitCalc.text = r.toString()
                            }


                        }
                    }
                    2 -> {

                        when (var2) {

                            0 -> {
                                Toast.makeText(this, "m to km", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/10000
                                unitCalc.text = r.toString()
                            }
                            1 -> {
                                Toast.makeText(this, "m to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*100
                                unitCalc.text = r.toString()
                            }
                            2 -> {
                                Toast.makeText(this, " m to m", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            3 -> {
                                Toast.makeText(this, "m to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*10
                                unitCalc.text = r.toString()
                            }
                            4 -> {

                                Toast.makeText(this, "m to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000
                                unitCalc.text = r.toString()
                            }
                            5 -> {
                                Toast.makeText(this, "m to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000000000
                                unitCalc.text = r.toString()
                            }
                            6 -> {
                                Toast.makeText(this, "m to μm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000000
                                unitCalc.text = r.toString()

                            }
                        }
                    }


                    3 -> {
                        when(var2) {

                            0-> {
                                Toast.makeText(this, "dm to km", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/10000
                                unitCalc.text = r.toString()
                            }
                            1-> {
                                Toast.makeText(this, "dm to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*10
                                unitCalc.text = r.toString()
                            }
                            2-> {
                                Toast.makeText(this, "dm to m", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/10
                                unitCalc.text = r.toString()
                            }
                            3-> {
                                Toast.makeText(this, "dm to dm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            4-> {
                                Toast.makeText(this, "dm to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*100
                                unitCalc.text = r.toString()
                            }
                            5-> {
                                Toast.makeText(this, "dm to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000000000
                                unitCalc.text = r.toString()

                            }
                            6-> {
                                Toast.makeText(this, "dm to µm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*100000
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    4-> {

                        when(var2) {

                            0-> {
                                Toast.makeText(this, "mm to km", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/1000000
                                unitCalc.text = r.toString()
                            }
                            1-> {
                                Toast.makeText(this, "mm to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/10
                                unitCalc.text = r.toString()

                            }
                            2-> {
                                Toast.makeText(this, "mm to m", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/1000
                                unitCalc.text = r.toString()

                            }
                            3-> {
                                Toast.makeText(this, "mm to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/100
                                unitCalc.text = r.toString()

                            }
                            4-> {
                                Toast.makeText(this, "mm to mm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                            5-> {
                                Toast.makeText(this, "mm to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toDouble()
                                val r = c*1000000
                                unitCalc.text = r.toString()

                            }
                            6-> {
                                Toast.makeText(this, "mm to μm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000
                                unitCalc.text = r.toString()

                            }

                        }
                    }

                    5-> {

                        when(var2) {

                            0->{
                                Toast.makeText(this, "nm to km", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-12)
                                unitCalc.text = r.toString()
                            }
                            1->{
                                Toast.makeText(this, "nm to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-7)
                                unitCalc.text = r.toString()

                            }
                            2->{
                                Toast.makeText(this, "nm to m", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-9)
                                unitCalc.text = r.toString()

                            }
                            3->{
                                Toast.makeText(this, "nm to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-8)
                                unitCalc.text = r.toString()

                            }
                            4->{
                                Toast.makeText(this, "nm to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-6)
                                unitCalc.text = r.toString()

                            }
                            5->{
                                Toast.makeText(this, "nm to nm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()

                            }
                            6->{
                                Toast.makeText(this, "nm to μm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/1000
                                unitCalc.text = r.toString()

                            }
                        }

                    }

                    6->{
                        when(var2) {
                            0->{
                                Toast.makeText(this, "μm to km", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-9)
                                unitCalc.text = r.toString()

                            }
                            1->{
                                Toast.makeText(this, "μm to cm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-4)
                                unitCalc.text = r.toString()

                            }
                            2->{
                                Toast.makeText(this, "μm to m", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-6)
                                unitCalc.text = r.toString()

                            }
                            3->{
                                Toast.makeText(this, "μm to dm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*(1E-5)
                                unitCalc.text = r.toString()

                            }
                            4->{
                                Toast.makeText(this, "μm to mm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c/1000
                                unitCalc.text = r.toString()

                            }
                            5->{
                                Toast.makeText(this, "μm to nm", Toast.LENGTH_SHORT).show()
                                val s = unitEdit.text.toString()
                                val c = s.toFloat()
                                val r = c*1000
                                unitCalc.text = r.toString()

                            }
                            6->{
                                Toast.makeText(this, "μm to nm", Toast.LENGTH_SHORT).show()
                                unitCalc.text = unitEdit.text.toString()
                            }
                        }
                    }
                }
            }

        }

    }
}
