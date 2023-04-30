import scala.collection.mutable.ArrayBuffer

@main
def arrays(): Unit = {
  val a = Array(1, 2, true)

  println(a)

  a.foreach(println)
  println(a.mkString)
  println(a.toList)

  a(1) = 4
  println(a.toList)

  val b = 0 +: a :+ 4
  println(b.toList)

  val c = a ++ b
  println(c.toList)

  val d = ArrayBuffer(1, 2, 3)
  println(d)
  d.addOne(4)
  println(d)
  d.addAll(List(7, 8, 9))
  println(d)

  println(d(1))
  d.remove(1)
  println(d)

//  d.remove(1, 3)
//  println(d)

  d --= List(4, 7, 8)
  println(d)
}