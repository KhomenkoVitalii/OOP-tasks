package restaurant

data class Dish(var name: String) {
    var ingredients: Array<Ingredient> = arrayOf();
}

data class Ingredient(var ingredient: Pair<Int, Pair<String, String>>){
}

data class Menu(var menu: MutableList<Dish>){}



/*
fun main() {
    var dish = Dish("Pasta");
    dish.ingredients[0] = Ingredient(1 to ("water" to "2 litres"))
}
*/