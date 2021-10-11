package task7

class Lorry(carClass: String, engine: Engine, driver: Driver, brand: String, var carrying: Int): Car(carClass,
    engine, driver, brand) {
    init {
        this.carClass = "Lorry";
    }
        override fun toString(): String{
            return "$carClass : car class.\n$engine : engine.\n$brand : brand.\n$driver : driver!\n$carrying : carrying";
        }
}