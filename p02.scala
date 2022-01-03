object PenultimateElement {
    def main(args:Array[String]): Unit = {
        def findPenultimateElement(list:List[Int]) = {
            list.init.last
        }

        val result = findPenultimateElement(List(1, 1, 2, 3, 5, 8))
        println(result) 
    }
}