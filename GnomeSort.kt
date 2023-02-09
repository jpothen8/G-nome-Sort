class GnomeSort {
    fun sort(arr: IntArray): Long {
        var index = 0
        var operations: Long = 0
        while (index < arr.size) {
            if (index == 0) index++
            if (arr[index] >= arr[index - 1]) {
                operations++
                index++
            } else {
                operations += 3
                val temp = arr[index]
                arr[index] = arr[index - 1]
                arr[index - 1] = temp
                index--
            }
        }
        return operations
    }
}
