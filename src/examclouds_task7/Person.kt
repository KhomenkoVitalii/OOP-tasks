package examclouds_task7

open class Person (var fullName: String, var age: Int){
    override fun toString(): String{
        return "Person's name: $fullName. Person's age: $age";
    }
}