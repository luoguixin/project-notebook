class Dog: Animal() {
    override val age: Int
        get() = 19
    override val name: String
        get() = "狗"
    override val height: Int
        get() = 17
    override val weight: Int
        get() = 15
    override fun sayAge() {
        println("$age")
    }

    override fun sayName() {
        println(name)
    }
    override fun say() {
        println("${weight * height}")
    }
}