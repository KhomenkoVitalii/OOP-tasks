package task7

fun main() {
    var lamba = Car ("Sport", Engine("Germany", 1000), Driver("Vitalii", 20, 3), "huracan");
    var zil = Lorry( "", Engine("Ukraine", 1000000), Driver("Anton", 48, 40), "130", 200);

    println(lamba.toString());
    println(zil.toString());
}