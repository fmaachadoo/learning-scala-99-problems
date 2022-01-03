object EliminateConsecutiveDuplicates {
    def main(args: Array[String]): Unit = {
        def eliminateConsecutiveDuplicatedElements(list: List[Any]): List[Any] = {
            list.foldRight(List[Any]()) {
                (element, unique_list) =>
                    if (unique_list.isEmpty || unique_list.head != element)
                        element :: unique_list
                    else
                        unique_list
            }
        }

        var list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
        val result = eliminateConsecutiveDuplicatedElements(list)
        println(result)
    }
}