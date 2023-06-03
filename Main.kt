class Main {
    fun say(){
        println("hello")
    }

}

fun main() {
   Main().say()
    Dog().apply {
        say()
        sayAge()
        sayName()
    }
    Animal().apply {
        say()
        sayAge()
        sayName()
    }
    val animal = Animal()
    println(animal.name)

}