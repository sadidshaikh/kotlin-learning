package collections

fun main() {
    // Print all authors
    val justAuthors = Library.books
        .map { book: Book ->
            book.authors
        }
        .map { authors: List<Author> ->
            // println(authors.joinToString { it.name })
            authors.joinToString {
                it.name
            }
        }
        .joinToString(separator = "\n")

    println(justAuthors)

//    println(justAuthors[0])
//    println(justAuthors[1])

    println()

    // Print Book Title + Authors
    val titleAuthors = Library.books
        .map { book ->
            val authors = book.authors.joinToString { author -> author.name }
            "${book.title} by $authors"
        }
        .joinToString(separator = "\n")

    println(titleAuthors)

    println()

    // Book Title + Location/ID
    val titleLocation = Library.books
        .mapIndexed { index, book ->
            "${index + 1} -> ${book.title}"
        }

    println(titleLocation.joinToString(separator = "\n"))
}