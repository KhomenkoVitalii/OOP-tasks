package examclouds_task7

class Sport(carClass: String, engine: Engine, driver: Driver, brand: String, var speed: Double): Car(carClass,
    engine, driver, brand) {
    init {
        this.carClass = "Sport";
    }
    override fun toString(): String{
        return "$carClass : car class.\n$engine : engine.\n$brand : brand.\n$driver : driver!\n$speed : speed";
    }
}