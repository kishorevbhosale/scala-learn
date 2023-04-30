import scala.collection.mutable.ArrayBuffer

@main
def listFunctionsPractice(): Unit ={
  val winners = List("Usain", "John", "Michael", "Alex", "Bob")
  val position = winners.indexOf("Michael") + 1
  println(s"Michael finished on position $position")

  val availableColors = List("red", "blue")
  val canPrint = availableColors.contains("red") && availableColors.contains("green") && availableColors.contains("blue")
  println(s"Printer can print: $canPrint")

  val requiredIngredients = ArrayBuffer("chicken", "egg", "mozzarella", "pepper")
  println(requiredIngredients)
  val index = requiredIngredients.indexOf("mozzarella")
  requiredIngredients(index) = "blue cheese"
  println(requiredIngredients)
  requiredIngredients.addOne("salt")
  println(requiredIngredients)

}