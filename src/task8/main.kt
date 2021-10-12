package task8

fun main() {
    var animals = mutableListOf<Animal>();
    animals.add(Cat("kotik", "rigik", "fish", "everywhere"))
    animals.add(Horse("loshadka", "spotted", 100.0, "hay", "everywhere"))
    animals.add(Dog("sobaka", "dvornaga", "meat", "everywhere"))

    val veterinarian = Veterinarian("Ivan Ivanovich");
    for (animal in animals){
        veterinarian.threatAnimal(animal);
    }
}