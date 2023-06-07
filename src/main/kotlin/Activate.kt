interface Activate {
    fun say(){} //加了{}就不是必须实现就是重写，如果没有那么就必须实现
    fun hello(): Number //如果要返回值则这里也要加
}