import scala.collection.mutable

@main
def mapsPractice(): Unit = {
  val count = mutable.HashMap(1 -> "un", 2 -> "deux", 3 -> "trois")
  println(count(2))
  println(count(3))

  count += 4 -> "quatre"
  println(count)


  val customers = Map("John" -> 1, "Alice" -> 5, "Bob" -> 3)
  println(s"Is Alice a customer? ${customers.contains("Alice")}")
  println(s"Alice bought ${customers("Alice")} products")
  println(s"Is Michael a customer? ${customers.contains("Michael")}")
}