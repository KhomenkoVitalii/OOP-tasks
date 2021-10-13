package examclouds_task7

open class Car (var carClass: String, var engine: Engine, var driver: Driver, var brand: String){
    fun start(){}
    fun stop(){}
    fun turnLeft(){}
    fun turnRight(){}
    override fun toString(): String{
        return "$carClass : car class.\n$engine : engine.\n$brand : brand.\n$driver : driver!";
    }
}