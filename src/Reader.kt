class Reader (var name: String, var ticketID: Int, var faculty: String, var birthDay: Long, var phoneNum: Int){
    init {
        name = "Undefined";
        ticketID = -1;
        faculty = "Undefined";
        birthDay = -1;
        phoneNum = -1;
    }

    fun takeBook(){}

    fun takeBook(numOfTakingBooks: Int){
        println("$name take $numOfTakingBooks books!");
    }

    fun takeBook(numOfTakingBooks: Array<String>){
        println("$name take $numOfTakingBooks books!");
    }

    fun takeBook(listOfBooks: MutableList<Book>){
        println("$name take $listOfBooks books!");
    }

    fun returnBook(){}

    fun returnBook(numOfTakingBooks: Int){
        println("$name return $numOfTakingBooks books!");
    }

    fun returnBook(numOfTakingBooks: Array<String>){
        println("$name return $numOfTakingBooks books!");
    }

    fun returnBook(listOfBooks: MutableList<Book>){
        println("$name return $listOfBooks books!");
    }
}