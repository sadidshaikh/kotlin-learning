package collections

fun main() {
    val multipleAuthors = Library.books
        .filter { it.authors.size > 1 }
        .onEach { book ->
            println(book)
        }

    println()

    val nonFiction = Library.books
        .filter { book ->
            book.genres.any { genre -> genre is Genre.NonFiction }
        }
        .onEach { println(it) }

    val notFiction = Library.books
        .filter { book ->
            book.genres.none { genre ->
                genre is Genre.Fiction
            }
        }
//        .map { "${it.title} is ${it.genres}" }
//        .also { it.forEach { println(it) } }

    val allFiction = Library.books
        .filter { book ->
            book.genres.all { genre ->
                genre is Genre.Fiction
            }
        }
//        .map { "${it.title} is ${it.genres}" }
//        .also { it.forEach { println(it) } }

    val allFictionNotJK = allFiction.filterNot { book ->
        book.authors.any { it.name == "J.K. Rowling" }
    }
        .map { "${it.title} is ${it.genres}" }
        .also { it.forEach { println(it) } }
}