class Phone(var number: Int, var model: String, var weight: Float){
    constructor(number: Int, model: String) : this(number, model, 0F){}
    constructor() : this(-1, "Undefined", 0F);

    fun receiveCall(incomeName: String){
        println("Incoming call from $incomeName!");
    }
    fun receiveCall(incomeName: String, incomeNumber: Int){
        println("Incoming call from $incomeName!" +
                " His phone number: $incomeNumber");
    }

    fun ToString(){
        println("Phone num: $number, model: $model, weight: $weight");
    }
}

fun main(){
    var phone1: Phone = Phone(3244, "Phone1", 4.2F);
    var phone2: Phone = Phone(5462, "Phone2", 1.6F);
    var phone3: Phone = Phone(9863, "Phone3", 0.3F);
    var phone4: Phone = Phone();
    var phone5: Phone = Phone(234234, "Phone5");

    phone1.ToString();
    phone2.ToString();
    phone3.ToString();

    phone1.receiveCall("Ivan");
    phone2.receiveCall("Vasia", +34384754);
    phone3.receiveCall("baby", phone1.number);
}

