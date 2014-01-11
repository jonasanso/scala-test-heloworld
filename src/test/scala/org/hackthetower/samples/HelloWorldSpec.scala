package org.hackthetower.samples

import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "Hello world" should {
    "say hello to the world" in {
      new HelloWorld().sayHello() must beEqualTo("Hello world")
    }
  }
}
