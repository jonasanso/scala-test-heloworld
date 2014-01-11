package org.hackthetower.samples

import org.scalatest.{FunSuite, Matchers}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends FunSuite with Matchers {

  test("Should say hello") {
    new HelloWorld().sayHello() shouldBe "Hello world"
  }
  test("Should sum correctly 2 simple numbers") {
    new HelloWorld().sum(2, 3) shouldBe 5
  }
}
