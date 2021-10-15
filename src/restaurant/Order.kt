package restaurant

data class Order (var id: Int, var date: Long, var client: Client, var chief: Chief){
    var purchased = mutableListOf<Dish>()
}