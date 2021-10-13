package examclouds_task11

fun main() {
    var shapes = mutableListOf<Shape>();

    shapes.add(Circle("pink", 32.2, 45.23));
    shapes.add(Circle("yellow", 2.45, 2343.54));
    shapes.add(Rectangle("blue", 532.254, 45.23));
    shapes.add(Rectangle("black", 87.54, 872.43));

    for (shape in shapes){
        shape.draw();
    }
}