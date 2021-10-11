class Matrix (var rowNum: Int, var columnNum: Int) {
    init {
        rowNum = 3;
        columnNum = 3;
    }

    var matrix: Array<Array<Float>> = Array(rowNum) { Array(columnNum) { 0F } }

    fun addMatrixes(){}
    fun multiplineNumToMatrix(){}
    fun ToString(){}
}