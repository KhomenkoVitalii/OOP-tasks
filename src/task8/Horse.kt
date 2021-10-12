package task8

class Horse (var name: String, var breed: String, var speed: Double, food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Ииииигг");
    }
}