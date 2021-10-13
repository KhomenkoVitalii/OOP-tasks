package examclouds_task7

class Driver(fullName: String, age: Int, var experience: Int, ) : Person(fullName, age){
    override fun toString(): String{
        return "Driver's name: $fullName. Driver's age: $age";
    }
}