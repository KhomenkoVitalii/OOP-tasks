fun main(){
    var a: Int = 1;
    var b: Int = 10;

    recursive(a, b)
}

fun recursive(a: Int, b: Int){
    var i: Int = a;
       if (i<=b){
           println(i);
           i+=1;
           recursive(i, b);
       }
}
