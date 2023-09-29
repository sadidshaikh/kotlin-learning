fun main() {
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println()
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)
    println()
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println()
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)
    println()
    println(Float.MIN_VALUE)
    println(Float.MAX_VALUE)
    println()
    println(Double.MIN_VALUE)
    println(Double.MAX_VALUE)
    println()
    println(1L)
    println(1)
    println(0x01)
    println(1.0)
    println(0b01)
    println()
    println(1.toLong())
    println(1.toDouble())
    println(1.toShort())
    println(1.toByte())
    println(1.toFloat())
    println(1.toString())
    println()
    print(
        """
        hi
    """.trimIndent()
    )
    println()
    Array(5) { it * it }.forEach {
        print("$it ")
    }
    println()
    val arr = arrayOf(1, 2, 3)
    arr.forEach {
        print("$it ")
    }
    println()
}