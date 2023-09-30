fun main() {
    val str = "Hello scope functions"

    val newStr1 = str.let {
        println("What is let?")
        it.replace(' ', '.').reversed()
    }
    println(newStr1)

    val newStr2 = str.run {
        println("What is run?")
        this.uppercase().removePrefix("HELLO").trim()
    }
    println(newStr2)

    val newStr3 = with(str) {
        println("What is with?")
        drop(5).toByteArray().contentToString()
    }
    println(newStr3)

    val apply = mutableListOf<Int>().apply {
        println("What is apply?")
        add(1)
        add(2)
        add(3)
    }
    println(apply)

    val also = mutableListOf<Int>().also {
        it.add(1)
        it.add(2)
        it.add(9)
        println("This is a side effect thing")
    }
    println(also)
}