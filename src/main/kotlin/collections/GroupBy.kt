package collections

fun main() {
    Library.books
        .groupBy { it.genres.first() }
        .mapValues { it.value.map { book -> book.title } }
        .onEach { println(it) }
}
