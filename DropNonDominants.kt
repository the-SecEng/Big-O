import kotlin.system.measureNanoTime

fun main() {
    // Example usage 1
    val time1 = measureNanoTime { dropNonDominants(10_000) }
    println("Example 1: Elapsed time: $time1 ns")

    // Example usage 2
    val time2 = measureNanoTime { dropNonDominants(100_000) }
    println("Example 2: Elapsed time: $time2 ns")

    // Example usage 3
    val time3 = measureNanoTime { dropNonDominants(1_000_000) }
    println("Example 3: Elapsed time: $time3 ns")
}

fun dropNonDominants(n: Int) {
    // O(n) operation
    for (i in 0 until n) {
        println("O(n) operation: $i")
    }

    // O(n^2) operation
    for (i in 0 until n) {
        for (j in 0 until n) {
            println("O(n^2) operation: $i, $j")
        }
    }

    // O(n^3) operation
    for (i in 0 until n) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                println("O(n^3) operation: $i, $j, $k")
            }
        }
    }

    // O(1) operation
    println("O(1) operation: Done!")
}
