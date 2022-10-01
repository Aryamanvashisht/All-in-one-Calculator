package com.arya.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mathsfunctions.*
import kotlin.math.pow
import kotlin.math.roundToInt

class Mathsfunctions : AppCompatActivity() {
     val E:Double = 2.718281828459

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mathsfunctions)

        pre.text = ""
        dispEdt.setText("")
        dispEdt.showSoftInputOnFocus = false

        clearButton.setOnClickListener {
            val length = dispEdt.length()
            if (length == 0) {
                pre.text = ""
            }
            if (length > 0) {
                dispEdt.setText(dispEdt.text.subSequence(0, length - 1))
            }
            dispEdt.setSelection(dispEdt.length())
        }
        sinTrigno.setOnClickListener {
            //dispEdt.append("sin(")
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
//                dispEdt.setText("Enter value first")
                  dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "sin("+str1
                val s: String = dispEdt.text.toString()
                val d: Double = s.toDouble()
                val e = Math.toRadians(d)
                val value = Math.sin(e)
                val str: String = String.format("%.12f", value)
                dispEdt.setText(str)
            }
            dispEdt.setSelection(dispEdt.length())
        }
        cosTrigno.setOnClickListener {
//            dispEdt.append("cos(")
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
                //dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "cos("+str1
                val s: String = dispEdt.text.toString()
                val d: Double = s.toDouble()
                val e = Math.toRadians(d)
                val value = Math.cos(e)
                val str: String = String.format("%.12f", value)
                dispEdt.setText(str)
            }
            dispEdt.setSelection(dispEdt.length())
        }
        tanTrigno.setOnClickListener {
            //dispEdt.append("tan(")
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
                //dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "tan("+str1
                val s: String = dispEdt.text.toString()
                val d: Double = s.toDouble()
                val e = Math.toRadians(d)
                val value = Math.tan(e)
                val str: String = String.format("%.12f", value)
                dispEdt.setText(str)
            }
            dispEdt.setSelection(dispEdt.length())
        }
        cotTrigno.setOnClickListener {
            // dispEdt.append("cot(")
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
                //dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "cot("+str1
                val s: String = dispEdt.text.toString()
                val d: Double = s.toDouble()
                val e = Math.toRadians(d)
                val value = Math.cos(e) / Math.sin(e)
                val str: String = String.format("%.12f", value)
                dispEdt.setText(str)
            }
            dispEdt.setSelection(dispEdt.length())
        }
        logTrigno.setOnClickListener {
            //dispEdt.append("log(")
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
               // dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "log("+str1
                val s: String = dispEdt.text.toString()
//            val d:Double = s.toDouble()
//            val e = Math.toRadians(d)
                val value = Math.log(s.toDouble())
                val str: String = String.format("%.12f", value)
                dispEdt.setText(str)
            }
            dispEdt.setSelection(dispEdt.length())
        }
        e.setOnClickListener {
            //dispEdt.append("ln(")
            val str1: String = dispEdt.text.toString()
            if(str1 == ""){
                //dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                if(dispEdt.text.toString() == "1"){
                    pre.text = "e"
                    dispEdt.setText(E.toString())
                }

                else {
                    pre.text = str1 + "e"
                    val s: String = dispEdt.text.toString()
                    val value = s.toInt()
                    val result = value * E
                    val str: String = String.format("%.12f", result)
                    dispEdt.setText(str)
                }

            }
            dispEdt.setSelection(dispEdt.length())
        }

        seven.setOnClickListener {
            dispEdt.append("7")
        }
        eight.setOnClickListener {
            dispEdt.append("8")
        }
        nine.setOnClickListener {
            dispEdt.append("9")
        }
        four.setOnClickListener {
            dispEdt.append("4")
        }
        five.setOnClickListener {
            dispEdt.append("5")
        }
        six.setOnClickListener {
            dispEdt.append("6")
        }
        one_1.setOnClickListener {
            dispEdt.append("1")
        }
        two.setOnClickListener {
            dispEdt.append("2")
        }
        three.setOnClickListener {
            dispEdt.append("3")
        }
        zero.setOnClickListener {
            dispEdt.append("0")
        }

        start_bracket.setOnClickListener {
            dispEdt.append("(")
        }
        end_bracket.setOnClickListener {
            dispEdt.append(")")
        }

        all_clear.setOnClickListener {
            pre.text = ""
            dispEdt.setText("")
        }

        xfact.setOnClickListener {
            val str_1: String = dispEdt.text.toString()
            if(str_1 == ""){
                dispEdt.hint ="Enter value first"
            }
            else {
                pre.text = str_1+"!"
                val str = dispEdt.text.toString()
                val str1: Int = str.toInt()
                val value = factorial(str1)
                dispEdt.setText(value.toString())
            }
            dispEdt.setSelection(dispEdt.length())
        }

        xsquare.setOnClickListener {
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = str1+"^2"
                val str = dispEdt.text.toString()
                val str1: Int = str.toInt()
                val value = str1.toDouble().pow(2)
                val result = value.roundToInt()
                dispEdt.setText(result.toString())
            }
            dispEdt.setSelection(dispEdt.length())
        }

        squareRoot.setOnClickListener {
            val str1: String = dispEdt.text.toString()
            if (str1 == "") {
               // dispEdt.setText("Enter value first")
                dispEdt.hint = "Enter value first"
                dispEdt.setSelection(dispEdt.length())
            } else {
                pre.text = "√"+str1
                val str = dispEdt.text.toString()
                val str1: Int = str.toInt()
                val result = str1.toDouble().pow(1 / 2.toDouble())
                val result1 = String.format("%.12f", result)
                dispEdt.setText(result1)
            }
            dispEdt.setSelection(dispEdt.length())
        }

        onebyx.setOnClickListener {
            val str1 = dispEdt.text.toString()
            if (str1 == "") {
                //dispEdt.setText("error!")
                dispEdt.hint = "Enter value first"
            } else {
                pre.text = "1/"+str1
                val str = dispEdt.text.toString()
                val str2: Int = str.toInt()
                val result = 1 / str2.toFloat()
                dispEdt.setText(result.toString())
            }
            dispEdt.setSelection(dispEdt.length())
        }

    }

    private fun factorial(x: Int): Int {
        if (x == 1 || x == 0) {
            return 1
        } else {
            return x * factorial(x - 1)
        }
    }
}