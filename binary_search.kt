// Basic implementation of binary search:

fun binarySearch(arr: IntArray, x: Int): Int {
    var low = 0
    var high = arr.size - 1
    
    while (low <= high) {
        val mid = low + (high - low) / 2
        when {
            arr[mid] == x -> return mid
            arr[mid] < x -> low = mid + 1
            else -> high = mid - 1
        }
    }
    return -1
}


// Recursive implementation of binary search:

fun binarySearchRecursive(arr: IntArray, x: Int, low: Int, high: Int): Int {
    if (low > high) return -1
    
    val mid = low + (high - low) / 2
    
    return when {
        arr[mid] == x -> mid
        arr[mid] < x -> binarySearchRecursive(arr, x, mid + 1, high)
        else -> binarySearchRecursive(arr, x, low, mid - 1)
    }
}
