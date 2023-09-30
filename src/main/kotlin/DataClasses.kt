data class Person(
    val name: String,
    val age: Int,
    val gender: String,
    val nationality: List<String>,
)

fun main() {
    val sadid = Person(
        name = "Sadid Shaikh",
        age = 21,
        gender = "Male",
        nationality = listOf("India")
    )
    println(sadid)

    val newSadid = sadid.copy(nationality = listOf("India", "Sri-Lanka"))
    println(newSadid)

    println(sadid.hashCode())
    println(newSadid.hashCode())

    // Checks value and structure
    println(sadid == newSadid)

    // Checks reference
    println(sadid === newSadid)

    val (name, a) = sadid
    println("$name is of age $a")
}