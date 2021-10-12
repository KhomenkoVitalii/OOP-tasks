package task11

class Circle(color: String, var x: Double, var y: Double) : Shape(color){
    override fun draw() {
        println("Circle: $color!");
    }
    override fun equals(){}
}