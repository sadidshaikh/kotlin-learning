package collections

fun main() {
    Library.books.iterator().let {
        while (it.hasNext()) {
            println(it.next())
        }
    }

    println()

    Library.books.let { books: List<Book> ->
        for (book in books) {
            println(book)
        }
    }

    println()

    Library.books.forEach {
        println(it)
    }

    println()

    Library.books.forEachIndexed { index, book ->
        println("$index : ${book.title}")
    }
}