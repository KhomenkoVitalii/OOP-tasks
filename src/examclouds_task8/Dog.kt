package examclouds_task8

class Dog(var name: String, var breed: String, food: String, location: String) : Animal(food, location) {
    override fun makeNoise(){
        println("gaf-gaf!");
    }
}