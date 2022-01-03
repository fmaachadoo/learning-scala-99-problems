object ListLenght {
    def main(args: Array[String]): Unit = {
        def findListLenght(list: List[Int]): Int = {
            list.length
        }

        val result = findListLenght(List(1, 1, 2, 3, 5, 8))
        println(result)
    }

}