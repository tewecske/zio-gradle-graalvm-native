package zio.graalvm

import zio.test._
import zio.test.junit._
import zio.test.Assertion._

class ZioAppTest extends JUnitRunnableSpec {
  
    override def spec = suite("ZioGraalVM")(
        test("hello") {
            assert(true)(equalTo(false))
        }
    )

}
