import scala.collection.mutable.ArrayBuffer

@main
def listChallenge(): Unit = {
  val items = ArrayBuffer("laptop", "mouse", "pen", "paper", "mug", "phone")
  val removedItems = ArrayBuffer("pen", "paper", "mug", "phone")

  items --= removedItems
  println(items)
}