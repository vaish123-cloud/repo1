object BubbleSortExample {
  def bubbleSort(arr: Array[Int]): Array[Int] = {
    val n = arr.length

    for (i <- 0 until n) {
      // Last i elements are already sorted
      for (j <- 0 until n - i - 1) {
        // Swap if the element found is greater than the next element
        if (arr(j) > arr(j + 1)) {
          // Swapping elements

          arr(j)=arr(j)^arr(j+1)
          arr(j+1)=arr(j)^arr(j+1)
          arr(j)=arr(j)^arr(j+1)

        }
      }
    }
    arr
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: " + arr.mkString(", "))
    val sortedArr = bubbleSort(arr)
    println("Sorted array: " + sortedArr.mkString(", "))
  }
}

//
//
//object BinarySearch {
//  def binarySearch(arr: Array[Int], target: Int): Int = {
//    var left = 0
//    var right = arr.length - 1
//
//    while (left <= right) {
//      val mid = left + (right - left) / 2
//
//      if (arr(mid) == target) {
//        return mid // Return the index where the target is found
//      } else if (arr(mid) < target) {
//        left = mid + 1 // Search the right half
//      } else {
//        right = mid - 1 // Search the left half
//      }
//    }
//    -1 // Return -1 if the target is not found
//  }
//
//  def main(args: Array[String]): Unit = {
//    val arr = Array(10, 20, 30, 40, 50)
//    val target = 30
//    val result = binarySearch(arr, target)
//
//    if (result != -1) {
//      println(s"Target $target found at index $result")
//    } else {
//      println(s"Target $target not found")
//    }
//  }
//}