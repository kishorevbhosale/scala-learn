@main
def maps(): Unit = {
  val count = Map(1 -> "one", 2 -> "two", 3 -> "three")
  val count2 = Map((1, "one"), (2, "two"), (3, "three"))
//  val count3 = Map[Int, String](1 -> "one", 2 -> true)
val count4 = Map()
  println(count)
  println(count2)
  println(count4)

  println(count(2))
  println(count.keySet)
  println(count.values)
}