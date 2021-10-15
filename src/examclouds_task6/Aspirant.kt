package examclouds_task6

class Aspirant (firstName: String, lastName: String, group: String, averageMark: Double, var isScientificWork: Boolean) : Student(firstName, lastName, group, averageMark) {
    override fun getScholarship(): Double{
        return if (averageMark == 5.0){
            200.0
        }
        else{
            180.0
        }
    }
}

fun main(){
    var student: Student = Aspirant("", "", "", -1.0, true);

    var students = mutableListOf<Student>(
        Student("Ivan", "Ivanovich", "1B-18", 4.5),
        Aspirant("Evgen", "Evgenovich", "4G-20", 5.0, true)
    );

    for (student in students){
        println(student.averageMark);
        println(student.getScholarship());
    }
}