package dev.zerosum

import org.scalatest.wordspec.AnyWordSpec

class SomethingTest extends AnyWordSpec {
  "doSomething" when {
    "2" should {
      "even" in {
        assert(Something.doSomething(2) == "even")
      }
    }

    "1" should {
      "odd" in {
        assert(Something.doSomething(1) == "odd")
      }
    }
  }
}
