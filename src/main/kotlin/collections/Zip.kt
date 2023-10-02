package collections

fun main() {
    val authors = Library.books.map { it.authors }
    val genres = Library.books.map { it.genres }

    val authorGenres: List<Pair<List<Author>, List<Genre>>> = authors.zip(genres)

    println(authorGenres)
    println(authorGenres[0])
    println()

    // Unzip
    authorGenres.unzip().also {
        println(it.first)
        println(it.second)
    }
}