import scala.collection.mutable.ArrayBuffer

@main
def listFunctionsChallenge(): Unit = {
  val animals = ArrayBuffer("lion", "zebra", "chimp", "elephant")
  println(animals)
  animals.addOne("panda")
  println(animals)
  animals.remove(animals.indexOf("lion"))
  println(animals)
  val hasAll = animals.contains("elephant") && animals.contains("giraffe")
  println(s"Does the zoo have both elephants and giraffes? $hasAll")
}