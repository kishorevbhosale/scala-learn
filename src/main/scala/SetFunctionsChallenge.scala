import scala.collection.mutable

@main
def setFunctionsChallenge(): Unit = {
  val acceptedColors = mutable.HashSet("white", "black", "gray")
  val myColors = Set("blue", "red", "black", "green")
  println(s"I can wear: ${myColors.intersect(acceptedColors)}")
  println(s"I cannot wear: ${myColors.diff(acceptedColors)}")

  acceptedColors.addOne("red")
  println(s"I can wear: ${myColors.intersect(acceptedColors)}")
  println(s"I cannot wear: ${myColors.diff(acceptedColors)}")

}