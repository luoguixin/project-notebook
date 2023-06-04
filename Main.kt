import java.io.*
import java.time.LocalTime
import java.util.*
data class Person(val name: String, val age: Int) //定义多返回值

class Main {
    fun say(){
        println("hello")
    }
    fun a(vararg s:Int){
        s.forEach {
            println(it)
        }
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
//    val lists = (1 .. 10000).toList()
//    println(lists)
    val list = arrayListOf<Int>()
    for (i in 1 .. 100000){
        if ( i% 2 == 0 && i% 5 == 0 && i%3 == 0){
            list.add(i)
        }
    }
    println(list.size)
    println(LocalTime.now().second)

    val person = Person("Tom", 20)

    val result: String = person.run {
        println("Name: $name")
        println("Age: $age")
        "My name is $name ,and I am $age years old." //run是返回最后一个的值，而apply返回的是对象本身
    } //run函数的使用方法

    println(result) // 输出："My name is Tom, and I am 20 years old."
    Main().a(1,2,3,4,5,6,7,8) //多参数

//    FileOutputStream("example.txt").use { //use相当于 try-with-resources
//        val output = BufferedWriter(Writer.nullWriter())
//        output.write("你好啊")
//        // 使用 input 进行操作
//    }
    /*
    * try {
    FileInputStream("example.txt").use {
        val input = BufferedInputStream(it)
        // 处理文件数据
        // 如果在操作过程中出现异常，将抛出异常并终止代码执行
    }
} catch (e: Exception) {
    // 处理异常
} finally {
    // 执行必要的清理操作，如关闭数据库连接等
}*/
    println("请输入您的名字：")
    val name = readlnOrNull() // 从控制台读取一行文本
    val file = File("example.txt") // 打开或创建文件对象
    name?.let { file.writeText(it) } // 将文本写入文件
    println("已保存用户输入到文件中")
}
