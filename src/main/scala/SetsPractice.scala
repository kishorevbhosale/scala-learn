import scala.collection.mutable

@main
def setsPractice(): Unit = {
  val colors = mutable.HashSet[String]()
  println(colors)
  colors.addAll(List("red", "green", "blue"))
  println(colors)
  colors.remove("green")
  println(colors)

  val objects = mutable.HashSet("laptop", "mouse", "pen", "paper", "coffee")
  val removeItems = Set("coffee", "paper", "pen")
  objects --= removeItems
  println(objects)
}