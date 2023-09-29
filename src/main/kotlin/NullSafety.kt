fun main() {
    var thisCouldExist: String? = "Sometime this exists, sometimes it does not"
    println(thisCouldExist)

    thisCouldExist = null
//    println(thisCouldExist)

    println(thisCouldExist?.length)

    if (thisCouldExist != null) {
        println(thisCouldExist.length)
    }

    println(thisCouldExist?.length ?: 0)
}