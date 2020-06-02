package br.com.wpaes.imc

enum class BMIClassification(val classification: String, val obesity: String) {
    MAGREZA("Magreza", "0"),
    NORMAL("Normal", "0"),
    SOBREPESO("Sobrepeso", "I"),
    OBESIDADE("Obesidade", "II"),
    OBESIDADE_GRAVE("Obesidade Grave", "III")
}