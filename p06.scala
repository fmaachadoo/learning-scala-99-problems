object PalidromeList {
    def main(args: Array[String]): Unit = {
        def isPalindrome(list: List[Int]): Boolean = {
            list == list.reverse
        }

        val result = isPalindrome(List(1, 2, 3, 2, 1))
        println(result)
    }
}