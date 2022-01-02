object LastElement {
    def main(args:Array[String]): Unit = {
        def findLastElement(list:List[Int]) = {
            list.last
        }

        var result = findLastElement(List(1, 1, 2, 3, 5, 8))
        println(result)
    }
}