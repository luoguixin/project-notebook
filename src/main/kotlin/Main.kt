
@Hello("你好")
class Main(num: Number) : Activate{
    init {
        println(num.number)
        val s = readln()
        println(s.replace("s", "t").uppercase())
    }

    override fun hello(): Number {
        println("hello")
        for (i in Color.values())
            println(i)
        return Number(12,"33")
    }

    override fun say() {
        println("hello word")
    }
    fun install(){
        println("注解")
    }
    fun processHelloAnnotation(annotation: Hello) {
        val atriValue = annotation.atri
        println("Processing Hello annotation with atri:$atriValue")
    }

    fun sayHello() {
        val annotation = Main::class.annotations.find { it is Hello } as? Hello //使用注解
        val atriValue = annotation?.atri
        println("Hello $atriValue!")
    }

}

fun main() {

  Main(Number(23, "小明")).apply {
      say()
      println(hello())
      install()
      processHelloAnnotation(Hello("你好"))
      sayHello()
  }
    val text: String? = readln()
    text?.let {
        println("text length is ${it.length}")
    } ?: run {
        println("text is null")
    }
// 输出：text length is 12
    //let...run...的用法
//    someObject?.let {
//        // 在这里对 someObject 进行处理
//        // 处理后的结果会作为 lambda 的返回值
//    } ?: run {
//        // 如果 someObject 为空，则执行这里的语句块
//    }
}