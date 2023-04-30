@main
def functionsRepeatedParameters(): Unit = {
  sayHello("Mary", "John", "Alex")

  val users = List("Alice", "Bob", "Carol")
//  sayHello(users)
  sayHello(users:_*)
}

def sayHello(names: String*): Unit =
  for (name <- names)
    println(s"Hello $name")