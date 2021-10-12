package task8

class Cat(var name: String, var breed: String, food: String, location: String) : Animal(food, location) {
    override fun makeNoise(){
        println("miav!");
    }
}