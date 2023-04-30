// This example shows how dropping constants can have a big impact on performance:

import kotlin.system.measureNanoTime

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isEmpty()) {
        return false
    }
    
    val rows = matrix.size
    val cols = matrix[0].size
    
    var i = 0
    var j = cols - 1
    
    while (i < rows && j >= 0) {
        val current = matrix[i][j]
        when {
            current == target -> return true
            current < target -> i++
            else -> j--
        }
    }
    
    return false
}

fun searchMatrix2(matrix: Array<IntArray>, target: Int): Boolean {
    for (row in matrix) {
        for (elem in row) {
            if (elem == target) {
                return true
            }
        }
    }
    return false
}

fun main() {
    // With a 100x100 matrix
    val matrix1 = Array(100) { IntArray(100) }
    val target1 = 42

    val time1 = measureNanoTime {
        val result1 = searchMatrix(matrix1, target1)
        println("Result 1: $result1")
    }
    println("Time complexity 1: $time1")

    // With a 1000x1000 matrix
    val matrix2 = Array(1000) { IntArray(1000) }
    val target2 = 42

    val time2 = measureNanoTime {
        val result2 = searchMatrix(matrix2, target2)
        println("Result 2: $result2")
    }
    println("Time complexity 2: $time2")

    // With a 100x1000 matrix
    val matrix3 = Array(100) { IntArray(1000) }
    val target3 = 42

    val time3 = measureNanoTime {
        val result3 = searchMatrix2(matrix3, target3)
        println("Result 3: $result3")
    }
    println("Time complexity 3: $time3")
}
