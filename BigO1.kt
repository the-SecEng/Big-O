fun main() {
    // Accessing an element in an array by index - O(1)
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val element = arr[2]
    println(element) // Output: 3

    // Getting the size of a collection - O(1)
    val list = listOf(1, 2, 3, 4, 5)
    val size = list.size
    println(size) // Output: 5

    // Adding an element to the end of a list - O(1) amortized time
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    println(mutableList) // Output: [1, 2, 3, 4, 5, 6]

    // Removing the last element of a list - O(1)
    mutableList.removeLast()
    println(mutableList) // Output: [1, 2, 3, 4, 5]

    // Accessing a value in a map by key - O(1) average time complexity
    val map = mapOf("apple" to 1, "banana" to 2, "orange" to 3)
    val value = map["banana"]
    println(value) // Output: 2

    // Adding a value to a map - O(1) average time complexity
    val mutableMap = mutableMapOf("apple" to 1, "banana" to 2, "orange" to 3)
    mutableMap["grape"] = 4
    println(mutableMap) // Output: {apple=1, banana=2, orange=3, grape=4}
}
