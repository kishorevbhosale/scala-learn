@main
def stringFunctions(): Unit = {
  val myPet = "Crocodile"
  println(myPet.length)

  val myName = "michelle"
  println(myName.capitalize)

  val myAnimal = "GirAfFe"
  println(myAnimal.toLowerCase)
  println(myAnimal.toUpperCase)

  val myText = "  there are too many       spaces      "
  println(myText)
  println(myText.trim)

  println(myText(5))
  println(myText.charAt(5))
  println(myText.substring(5))
  println(myText.substring(5, 10))

  println(myText.trim.length)
  println(myText.trim.substring(3, 6).charAt(0))
}