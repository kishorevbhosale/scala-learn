import scala.collection.mutable

@main
def mapsChallenge(): Unit = {
  val attendance = mutable.HashMap("23/09" -> 3726, "24/09" -> 4735, "25/09" -> 2836)
  println(attendance)
  attendance += "26/09" -> 5362
  println(attendance)
  val total = attendance("25/09") + attendance("26/09")
  println(total)
  println(attendance.contains("22/09"))
}