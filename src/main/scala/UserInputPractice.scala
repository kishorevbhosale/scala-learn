import scala.io.StdIn

@main
def userInputExercises(): Unit = {
  println("What is you name?:")
  val name = StdIn.readLine()
  println(s"Welcome, $name")

  println("Please enter a number:")
  val number = StdIn.readLine().toInt
  val result = number * 5
  println(result)
}