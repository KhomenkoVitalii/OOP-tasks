package task8

class Veterinarian(var name: String) {
    fun threatAnimal(animal: Animal){
        println("This animal from ${animal.location}. Veterinarian give some ${animal.food} to animal!");
    }
}