import scala.collection.mutable

@main
def setsChallenge(): Unit = {
  val customers = mutable.HashSet("Alex", "Mary", "John")
  println(customers)
  customers += "Alice"
  println(customers)
  customers -= "Alex"
  println(customers)
}