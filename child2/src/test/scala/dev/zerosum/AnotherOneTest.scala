package dev.zerosum

import org.scalatest.wordspec.AnyWordSpec

class AnotherOneTest extends AnyWordSpec {
  "doSomething" when {
    "2" should {
      "even" in {
        assert(AnotherOne.doSomething(2) == "even")
      }
    }

    "1" should {
      "odd" in {
        assert(AnotherOne.doSomething(1) == "odd")
      }
    }
  }

}
