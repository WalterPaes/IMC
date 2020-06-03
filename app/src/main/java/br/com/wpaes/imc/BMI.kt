package br.com.wpaes.imc

import kotlin.math.pow

class BMI(var height: Double, var weight: Double) {

    private var result: Double = 0.00
    private var classification: String = ""
    private var obesity: String = ""

    fun calculate() {
        result = weight / height.pow(2.0)
    }

    fun setClassificationAndObesity() {
        if (result < 18.5) {
            classification = BMIClassification.MAGREZA.classification
            obesity = BMIClassification.MAGREZA.obesity
        } else if (result > 18.5 && result < 24.9) {
            classification = BMIClassification.NORMAL.classification
            obesity = BMIClassification.NORMAL.obesity
        } else if (result > 25.0 && result < 29.9) {
            classification = BMIClassification.SOBREPESO.classification
            obesity = BMIClassification.SOBREPESO.obesity
        } else if (result > 30.0 && result < 34.9) {
            classification = BMIClassification.OBESIDADE.classification
            obesity = BMIClassification.OBESIDADE.obesity
        } else if (result > 35.0 && result < 39.9) {
            classification = BMIClassification.OBESIDADE_2.classification
            obesity = BMIClassification.OBESIDADE_2.obesity
        } else {
            classification = BMIClassification.OBESIDADE_GRAVE.classification
            obesity = BMIClassification.OBESIDADE_GRAVE.obesity
        }
    }
}