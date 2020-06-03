package br.com.wpaes.imc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    companion object{
        const val BMI_RESULT = "bmi"
        const val BMI_CLASSIFICATION = "classification"
        const val BMI_OBESITY = "obesity"
        const val BMI_IMG = "image"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Create the Page with Data
        val result = intent.getStringExtra(BMI_RESULT)
        val classification = intent.getStringExtra(BMI_CLASSIFICATION)
        val obesity = intent.getStringExtra(BMI_OBESITY)
        val img = intent.getStringExtra(BMI_IMG)

        val txtResult = findViewById<TextView>(R.id.txtResult)
        val imgResult = findViewById<ImageView>(R.id.imgResult)

        txtResult.text = "IMC: $result \nCLASSIFICAÇÃO: $classification \nGRAU DE OBESIDADE: $obesity"
        imgResult.setImageResource(img.toInt())

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
