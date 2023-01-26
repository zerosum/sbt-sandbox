package dev.zerosum

object AnotherOne {

  def doSomething(value: Int): String = {
    if (value % 2 == 0)
      "even"
    else
      "odd"
  }
}
