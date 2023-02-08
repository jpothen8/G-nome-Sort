class GnomeSort {
    fun sort(arr: IntArray) {
        var index = 0
        while (index < arr.size) {
            if (index == 0) index++
            if (arr[index] >= arr[index - 1]) index++ else {
                val temp = arr[index]
                arr[index] = arr[index - 1]
                arr[index - 1] = temp
                index--
            }
        }
    }
}