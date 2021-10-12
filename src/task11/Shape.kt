package task11

abstract class Shape(var color: String) {
    abstract fun draw()
    open fun equals(){}
}