package collections

fun main() {
    Library.books
        .fold(0) { acc, book -> acc + book.price }
        .also { println(it) }

    println()

    Library.books
        .map { it.price }
        .reduce { acc, price -> acc + price }
        .also { println(it) }

    println()

    Library.books
        .map { it.price }
        .sum().also { println(it) }

    println()

    Library.books
        .sumOf { it.price }
        .also { println(it) }

    println()

    Library.books
        .filter { it.authors.any { author -> "J.K. Rowling" == author.name } }
        .minBy { it.price }
        .also { println(it.title) }
}