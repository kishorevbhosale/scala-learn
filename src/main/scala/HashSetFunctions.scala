import scala.collection.mutable

@main
def hashSetFunctions(): Unit = {
  val numbers = mutable.HashSet(3, 4, null, 83, 56)
  println(numbers)
  numbers.addOne(22)
  println(numbers)
  numbers.addAll(List(5, 6, 83))
  println(numbers)
  numbers.remove(5)
  numbers.subtractOne(22)
  println(numbers)

  val n2: Set[Matchable] = Set(4, 5, 6, 7, 8)
  println(numbers.intersect(n2))
  println(numbers.union(n2))
  println(numbers.diff(n2))
}