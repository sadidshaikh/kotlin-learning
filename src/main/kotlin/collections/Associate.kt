package collections

fun main() {
    Library.books
        .associate {
            Pair(it.genres.first(), it)
        }
        .forEach {
            println("Key : ${it.key}")
            println("Value: ${it.value}")
        }

    println()

    Library.books
        .associateBy { it.genres.first() }
        .forEach {
            println("Key : ${it.key}")
            println("Value: ${it.value}")
        }

    println()

    Library.books
        .associateWith { it.price }
        .forEach { (key, value) ->
            println("$key -> $value")
        }
}