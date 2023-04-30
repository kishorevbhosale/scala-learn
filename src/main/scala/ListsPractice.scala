import scala.collection.mutable.ArrayBuffer

@main
def listsExercises(): Unit = {
  val animals = List("cat", "dog", "elephant", "hippo")
  println(animals.length)
  println(animals(1))

  val customers = ArrayBuffer("Alex", "John", "Michelle", "Judy")
  println(customers)
  val newCustomer = "Mary"
  customers.addOne(newCustomer)
  println(customers)

  val leavingCustomer = "John"
  val leavingIndex = customers.indexOf(leavingCustomer)
  customers.remove(leavingIndex)
  println(customers)
}