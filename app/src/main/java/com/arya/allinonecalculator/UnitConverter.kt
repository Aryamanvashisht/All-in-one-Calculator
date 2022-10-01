package com.arya.allinonecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_unit_converter.*

class UnitConverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_converter)

        imgLength.setOnClickListener {
             startActivity(Intent(this@UnitConverter,CalculateLength::class.java))
        }

        imgArea.setOnClickListener {
            startActivity(Intent(this@UnitConverter,CalculateArea::class.java))
        }

        imgVol.setOnClickListener {
            startActivity(Intent(this@UnitConverter,CalculateVolume::class.java))
        }

        imgSpeed.setOnClickListener {
            startActivity(Intent(this@UnitConverter,CalculateSpeed::class.java))
        }
        imgWeight.setOnClickListener {
            startActivity(Intent(this@UnitConverter,CalculateWeight::class.java))
        }

        imgTemperature.setOnClickListener {
            startActivity(Intent(this@UnitConverter,CalculateTemp::class.java))
        }

    }
}