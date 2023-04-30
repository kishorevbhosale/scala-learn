@main
def functionsRepeatedParametersPractice(): Unit = {
  println(sumOfIntegers(7, 3, 8, 5, 6, 34, 78, 34))
  println(sumOfIntegers(3, 6, 4, 5))
  println(sumOfIntegers(3, 78, 345, 78, 45456, 567, 4564, 56))
}

def sumOfIntegers(numbers: Int*): Int =
  var sum = 0
  for (number <- numbers)
    sum += number
  sum