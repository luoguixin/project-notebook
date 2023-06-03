open class Animal {
    open val weight:Int = 40
    open val height:Int = 20
    open val age:Int = 10
    open val name:String = "动物"
    open fun sayName(){
        println("我的名字是${name}")
    }
    open fun sayAge(){
        println("我现在${age} 岁了")
    }
    open fun say(){
        println("${weight * height}")
    }
}