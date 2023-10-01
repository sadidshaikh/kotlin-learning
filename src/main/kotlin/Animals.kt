fun main() {

    val dog = Dog()
    println(dog.talk())
    println(dog.move())
    println(dog.eat("steak"))
    println(dog.eat("carrot"))

    println()

    val cat = Cat()
    println(cat.talk())
    println(cat.move())
    println(cat.eat("fish"))
    println(cat.eat("carrot"))
}

interface Animal {

}

interface CanMove {
    fun move(): String
}

interface CanTalk {
    fun talk(): String
}

interface CanEat {
    fun eat(food: String): Boolean // true if enjoyed, false if disgusted
}

class FastMove : CanMove {
    override fun move(): String {
        return "FAST"
    }
}

class Cat() : CanMove by FastMove(), CanTalk, CanEat {
    override fun talk(): String {
        return "MEOW!"
    }

    override fun eat(food: String): Boolean {
        return "fish" == food
    }

}

class Dog() : CanMove by FastMove(), CanTalk, CanEat {
    override fun move(): String {
        return "SLOW"
    }

    override fun talk(): String {
        return "WOOF!"
    }

    override fun eat(food: String): Boolean {
        return food == "steak"
    }
}