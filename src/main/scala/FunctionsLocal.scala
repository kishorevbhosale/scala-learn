@main
def functionsLocal(): Unit = {
  listAnimals()
//  listOneAnimal("dog")
}

def listAnimals(): Unit =
  def listOneAnimal(animal: String): Unit =
    println(s"I have a $animal")

  val myAnimals = List("cat", "dog", "cow", "horse")
  for (animal <- myAnimals)
    listOneAnimal(animal)