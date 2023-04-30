@main
def stringsExercises(): Unit = {
  val catName = "My cat's name is \"Fluffy\""
  println(catName.length)

  val myCar = "My car won't start"
  println(myCar.substring(3, 6))

  val clientName = "John"
  println(s"Hello $clientName, how are you?")

  val apples = 3
  val oranges = 6
  println(s"We have ${apples + oranges} fruits")
}