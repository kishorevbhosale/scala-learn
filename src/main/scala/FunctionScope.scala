@main
def functionScope(): Unit = {
  example()
//  println(s"I have $flowers flowers")
//  test()
}

def example(): Unit =
  val flowers = 5
  test()
  def test(): Unit = {
    println(s"I have $flowers flowers")
  }