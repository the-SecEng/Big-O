fun main() {
    // Adding an element to the end of an array (push)
    val array1 = mutableListOf(1, 2, 3, 4, 5) // O(1)
    array1.add(6)
    println(array1) // Output: [1, 2, 3, 4, 5, 6]

    // Removing an element from the end of an array (pop)
    val array2 = mutableListOf(1, 2, 3, 4, 5) // O(1)
    array2.removeLast()
    println(array2) // Output: [1, 2, 3, 4]

    // Adding an element to the beginning of an array (unshift)
    val array3 = mutableListOf(1, 2, 3, 4, 5) // O(n)
    array3.add(0, 0)
    println(array3) // Output: [0, 1, 2, 3, 4, 5]

    // Removing an element from the beginning of an array (shift)
    val array4 = mutableListOf(1, 2, 3, 4, 5) // O(n)
    array4.removeFirst()
    println(array4) // Output: [2, 3, 4, 5]

    // Inserting an element in the middle of an array (splice)
    val array5 = mutableListOf(1, 2, 3, 4, 5) // O(n)
    array5.add(2, "hello")
    println(array5) // Output: [1, 2, hello, 3, 4, 5]

    // Removing an element from the middle of an array (splice)
    val array6 = mutableListOf(1, 2, 3, 4, 5) // O(n)
    array6.removeAt(2)
    println(array6) // Output: [1, 2, 4, 5]

    // Accessing an element by index
    val array7 = mutableListOf(1, 2, 3, 4, 5) // O(1)
    println(array7[2]) // Output: 3

    // Searching for an element in an array
    val array8 = mutableListOf(1, 2, 3, 4, 5) // O(n)
    val index = array8.indexOf(3)
    println(index) // Output: 2
}
