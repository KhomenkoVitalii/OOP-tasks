package task8

abstract class Animal (var food: String, var location: String) {
    open fun makeNoise(){}
    fun eat(){}
    fun sleep(){}
}