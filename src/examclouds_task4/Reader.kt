package examclouds_task4

class Reader (var name: String, var ticketID: Int, var faculty: String, var birthDay: Long, var phoneNum: Int){
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

fun main() {
    var books = mutableListOf<Book>()
    books.add(Book("SomeAuthor", "SomeName"))
    books.add(Book("SomeAuthor2", "SomeName2"))
    books.add(Book("SomeAuthor3", "SomeName3"))

    for (book in books) println("${book.authorName} - ${book.bookName}")
}