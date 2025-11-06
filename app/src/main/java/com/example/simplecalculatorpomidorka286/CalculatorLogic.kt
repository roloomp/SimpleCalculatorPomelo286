package com.example.simplecalculatorpomidorka286

class CalculatorLogic {

    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) throw ArithmeticException("eRRor")
        return a / b
    }

    fun percent(a: Double): Double = a / 100

    fun changeSign(a: Double): Double = -a

    fun clear(): Double = 0.0
}

