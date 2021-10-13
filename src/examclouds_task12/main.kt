package examclouds_task12;

fun main() {
    var user: User = User("someLogin", "somePassword");

    var alcoholProducts = mutableListOf<Product>()
    alcoholProducts.add(Product("Beer", 9.99, 4))
    alcoholProducts.add(Product("Vodka", 69.99, 3))

    var foodProducts = mutableListOf<Product>()
    alcoholProducts.add(Product("Pasta", 40.7, 5))
    alcoholProducts.add(Product("Meat", 167.23, 5))

    var alcoholCategory = Category("Alcohol", alcoholProducts)
    var foodCategory = Category("Food", foodProducts)
}