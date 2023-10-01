package collections

fun main() {
    val authors = Library.books
        .map { it.authors }
        .flatten()
        .map { it.name }

    println(authors.joinToString(separator = ",\n"))

    println()

    val authorsList = Library.books
        .flatMap { it.authors }
        .map { it.name }

    println(authorsList.joinToString(separator = ",\n"))
}