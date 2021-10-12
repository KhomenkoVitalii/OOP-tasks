package task11

class Rectangle(color: String, var x: Double, var y: Double) : Shape(color){
    override fun draw() {
        println("Rectangle: $color!");
    }

    override fun equals(){}
}