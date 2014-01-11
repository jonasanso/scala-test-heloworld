package org.hackthetower.samples

import org.scalatest.Matchers

class HelloWorldTest extends Matchers {

  test("Should sum correctly 2 simple numbers") {
    new HelloWorld().sum(2, 3) shouldBe 5
  }
}
