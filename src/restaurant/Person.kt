package restaurant

abstract class Person(val id: Int,
                      var firstName: String,
                      var lastName: String) {
}

class Client(id: Int, firstName: String, lastName: String) : Person(id, firstName, lastName){
    fun getMenu(){}
    fun makeOrder(): Order? {return null}
}

class Chief(id: Int, firstName: String, lastName: String) : Person(id, firstName, lastName){
    fun getOrder() {}
    fun confirmReadyOrder(): Boolean {return true;}
}
