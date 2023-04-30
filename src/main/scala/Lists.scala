@main
def lists(): Unit = {
  val l = List(1, 2, 3, 2, 5)
  println(l)

  val m = List(1, true, "hello")
  println(m)
  val n = List()
  val o = Nil
  println(n)
  println(o)

//  val p = List[Int](1, 2, true)

  val matrix = List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
  println(matrix)
  println(matrix(0)(1))

  println(l(2))

  val colors = List("red", "green", "blue")
  println(colors.head)
  println(colors.tail)
  println(colors.tail.head)

  println(colors.length)
}