
object ConsecutiveDuplicatesSublists {
    def main(args: Array[String]): Unit = {
        def packConsecutiveElements(list: List[String]): List[List[String]] = {
            val (packed, next) = list.span({ _ == list.head })

            if (next == Nil)
                List(packed)
            else 
                packed :: packConsecutiveElements(next)
        }
        
        var list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
        val result = packConsecutiveElements(list)
        println(result)
    }
}