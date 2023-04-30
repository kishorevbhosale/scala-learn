import scala.io.StdIn

@main
def userInputReadingNumber(): Unit = {
  val input = StdIn.readLine()
  val number = input.toInt
  println(number * 2)
}