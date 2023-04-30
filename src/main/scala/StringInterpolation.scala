@main
def stringInterpolation(): Unit = {
  val myDog = "Teddy"
  println(s"My dog's name is $myDog, and he's a good boy")

  println(s"I have ${5/2} cats")

  println(raw"This is a \n new \\line")
}