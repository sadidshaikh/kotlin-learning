fun doSomeMath(x: Int = 0, y: Int = 0, operator: String = "add"): Int {
    return when (operator) {
        "add" -> x + y
        "times" -> x * y
        "divide" -> x / y
        "subtract" -> x - y
        else -> 0
    }
}

fun printLine(message: Any): Unit {
    println(message)
}

fun main() {
    println(doSomeMath(8, 5, "multiply"))
    printLine("This is great bro! : ${doSomeMath(y = 8, x = 9, operator = "multiply")}")
}