import scala.collection.mutable

@main
def hashSets(): Unit = {
  val values = mutable.HashSet(3, 4, true, "hi")
  val noValues = mutable.HashSet[Int]()

  println(values)

  values.add(86)
  println(values)
  values.remove(4)
  println(values)
  values += 9
  values -= 3
  println(values)

  values.addAll(List(1, 2, 3, 4, 5, 2))
  println(values)

  values += (10, 11)
  values -= (4, 5)
  println(values)

  val colors = mutable.HashSet("red", "green", "blue")
  colors ++= Set("pink", "orange")
  println(colors)
  colors --= Set("red", "blue")
  println(colors)
}