fun main() {
    val calculator = Calculator(initialValue = 2)
    calculator.add(38)
    println(calculator.currentValue)

    calculator.add(-8)
    println(calculator.currentValue)
}

class Calculator(initialValue: Int = 0) {
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