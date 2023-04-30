@main
def setFunctionsPractice(): Unit = {
  val primes = Set(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
  println(s"Is the number 21 prime? ${primes.contains(21)}")
  println(s"Is the number 13 prime? ${primes.contains(13)}")

  val myDrinks = Set("water", "coke", "beer", "orange juice")
  val theirDrinks = Set("water", "orange juice", "pineapple juice", "milk")
  println(myDrinks.intersect(theirDrinks))
}