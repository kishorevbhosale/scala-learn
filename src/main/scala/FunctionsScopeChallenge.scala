@main
def functionsScopeChallenge(): Unit = {
  val parakeets = 5
  buyMoreParakeets(parakeets)
  println(s"You now have $parakeets parakeets")
}

def buyMoreParakeets(parakeets: Int): Unit =
  val parakeets = 3