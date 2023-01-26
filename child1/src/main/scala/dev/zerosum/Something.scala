package dev.zerosum

object Something {

  def doSomething(value: Int): String = {
    if (value % 2 == 0)
      "even"
    else
      "odd"
  }
}
