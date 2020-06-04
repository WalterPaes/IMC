package br.com.wpaes.imc

import android.content.Intent
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
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnCalculate.setOnClickListener {
            val height = txtHeight.text.toString()
            val weight = txtWeight.text.toString()

            // Check if the fields are not null
            if (height.isEmpty() || weight.isEmpty()) {
                Toast.makeText(this, "Fill correctly the fields", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            // Instantiate the BMI class and call Calculate and Classification methods in Constructor
            val bmi = BMI(height.toDouble(), weight.toDouble())

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.BMI_RESULT, bmi.result)
            intent.putExtra(ResultActivity.BMI_CLASSIFICATION, bmi.classification)
            intent.putExtra(ResultActivity.BMI_OBESITY, bmi.obesity)
            intent.putExtra(ResultActivity.BMI_IMG, bmi.img)
            startActivity(intent)
        }

        btnClear.setOnClickListener {
            txtHeight.text = ""
            txtWeight.text = ""
        }
    }
}
