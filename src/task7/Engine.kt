package task7

class Engine (var company: String, var power: Int){
    override fun toString() : String{
        return "$company : compony.\n$power : power.";
    }
}
