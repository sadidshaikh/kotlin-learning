package collections

fun <T> List<T>.customPartition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val pass = ArrayList<T>()
    val fail = ArrayList<T>()

    for (e in this) {
        if (predicate(e)) pass.add(e)
        else fail.add(e)
    }

    return Pair(pass, fail)
}

fun main() {
    val (validList, invalidList) = listOf(1, 2, 3, 4, 5).partition { it > 3 }
    println(validList)
    println(invalidList)
    println()

    val (fiction, nonFiction) = Library.books.partition { book ->
        book.genres.any { it is Genre.Fiction }
    }

    println(fiction)
    println(nonFiction)
}