class Person(var fullName: String, var age: Short) {
    constructor() : this("Undefined", -1);

    fun move(){
        println("Я, $fullName, двигаюсь!");
    }

    fun talk(){
        println("Я, $age, говорю!");
    }
}

fun main(){
    val person1: Person = Person("Ivan Ivanovich", 64);
    val person2: Person = Person();
}