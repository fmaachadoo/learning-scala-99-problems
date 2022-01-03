object ReverseList {
    def main(args: Array[String]): Unit = {
        def reverseList(list: List[Int]): List[Int] = {
            list.reverse
        }

        val result = reverseList(List(1, 1, 2, 3, 5, 8))
        println(result)
    }
}