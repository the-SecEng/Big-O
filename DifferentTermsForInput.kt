// O(a + b)
fun logItems(a: Int, b: Int) {
    for (i in 0 until a) {
        println(i)
    }
    for (j in 0 until b) {
        println(j)
    }
}

// O(a * b)
fun logItemsNested(a: Int, b: Int) {
    for (i in 0 until a) {
        for (k in 0 until b) {
            println("$i $k")
        }
    }
}

// Example usage
fun main() {
    println("For loop:")
    logItems(10, 20)
    println("===============================")
    println("Nested for loops:")
    logItemsNested(10, 20)
}
