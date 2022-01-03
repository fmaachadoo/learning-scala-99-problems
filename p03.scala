object KthElement {
    def main(args: Array[String]): Unit = {
        def findKthElement(list:List[Int], k:Int): Int = {
            list(k)
        }

        val result = findKthElement(List(1, 1, 2, 3, 5, 8), 4)
        println(result)
    }
}