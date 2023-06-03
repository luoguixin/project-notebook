import java.util.TreeMap

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
    val a = 1
    val b = "3345fff"
    // println(a + b) 这样不行
    println(b + a) //这样就行
    println(b[3]) //和pytho一样
    val arrayOf = arrayOf(1,2,3,4, "5")
    println(arrayOf.toList()[4] is String) //变成列表
    val mutableMapOf = mutableMapOf("1" to "2", "3" to "2") //集合
    println(mutableMapOf.toList())
    val treeMap = TreeMap<Any, Any>()
    treeMap.apply {
        set(2, 8)
    }
    println(treeMap.toList())
    val f:Int? = null //?就是让它可为空
    println(f)
    //when{}else{}相当于switch语句
    when(a){
        in 1..10 -> {
            println("在这里面") //else可以不加
        }
        else -> {
            println("没有在")
        }
    }
}
