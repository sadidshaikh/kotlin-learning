fun main() {
    val calculator = BetterCalculator(initialValue = 2)
    calculator.add(38)
    println(calculator.currentValue)

    calculator.add(-8)
    println(calculator.currentValue)

    println(calculator.remainder(10))
}

abstract class Calculator(initialValue: Int = 0) {
    var currentValue = initialValue

    fun add(first: Int): Int {
        currentValue += first
        return currentValue
    }

    fun subtract(first: Int): Int {
        currentValue -= first
        return currentValue
    }

    fun multiply(first: Int): Int {
        currentValue *= first
        return currentValue
    }

    fun divide(first: Int): Int {
        currentValue /= first
        return currentValue
    }
}

class BetterCalculator(initialValue: Int) : Calculator(initialValue) {

    fun remainder(number: Int): Int {
        return currentValue % number
    }

}