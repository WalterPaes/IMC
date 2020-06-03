package br.com.wpaes.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtHeight = findViewById<TextView>(R.id.txtHeight)
        val txtWeight = findViewById<TextView>(R.id.txtWeight)

        btnCalculate.setOnClickListener {
            val height = txtHeight.text.toString()
            val weight = txtHeight.text.toString()

            if (height.isEmpty() || weight.isEmpty()) {
                Toast.makeText(this, "Fill correctly the fields", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val bmi = BMI(height.toDouble(), weight.toDouble())

        }

    }
}
