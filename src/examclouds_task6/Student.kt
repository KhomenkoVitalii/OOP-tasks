package examclouds_task6

open class Student (var firstName: String, var lastName: String, var group: String, var averageMark: Double){
    open fun getScholarship() : Double {
        return if (averageMark == 5.0) {
            100.0;
        } else 80.0;
    }
}