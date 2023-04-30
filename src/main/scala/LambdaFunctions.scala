@main
def lambdaFunctions(): Unit = {
  val myLambda = (name: String) => println(s"Hello $name")

  myLambda("Alex")
}