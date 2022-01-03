object FlattenList {
    def main(args: Array[String]): Unit = {
        def flatten(list: List[Any]): List[Any] = list flatMap {
            case nested_list: List[_] => flatten(nested_list)
            case e => List(e)
        }

        val list = List(List(1, 1), 2, List(3, List(5, 8)))
        val result = flatten(list)
        println(result)
    }
}