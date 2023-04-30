@main
def tuplePractice(): Unit = {
  val userInfo = ("Alex", "alex@gmail.com", 635243)
  println(s"User ${userInfo._1} has account number ${userInfo._3}")

  val moreUserInfo = userInfo ++ Tuple1(1200)
  println(moreUserInfo)
}