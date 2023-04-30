@main
def stringsChallenge(): Unit = {
  val client = "Mary"
  val products = 3
  val price = 30
  println(s"Hello $client, your total amount is ${products * price}")
}