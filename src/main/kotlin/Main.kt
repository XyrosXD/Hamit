fun main(){
    val arr = intArrayOf(4, 7, 1, 9, 5)
    val secondLargest = findSecondLargest(arr)
    println(secondLargest)
}
fun findSecondLargest(arr: IntArray): Int {
    if (arr.size < 2) {
        return -1
    }
    var largest = arr[0]
    var secondLargest = arr[0]
        for (i in 1 until arr.size) {
             if (arr[i] > largest) {
                    secondLargest = largest
                    largest = arr[i]
        }   else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i]
        }
    }
    return if (secondLargest != largest) secondLargest else -1
}