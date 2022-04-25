package zio.graalvm

import zio._
import zio.test._
import zio.test.junit._
import zio.test.Assertion._
import zio.test.TestAspect._
import zio.test.TestPlatform._
import scala.jdk.CollectionConverters._

class ZioAppTest extends JUnitRunnableSpec {
  
    override def spec = suite("ZioGraalVM")(
        test("hello properties") {
            for {
                _       <- Console.printLine(java.lang.System.getProperties.asScala.mkString("\n"))
                output <- TestConsole.output
            } yield assert(output)(isNonEmpty)
        },
        test("is GraalVN") {
            assert(isJS)(equalTo(false)) &&
            assert(isJVM)(equalTo(true)) &&
            assert(isNative)(equalTo(false)) &&
            assert(isGraalVM)(equalTo(true))
        } @@ graalVMOnly,
        test("hello JVM") {
            assert(true)(equalTo(true))
        },
        test("hello GraalVM") {
            assert(true)(equalTo(false))
        } @@ graalVMOnly
    )

}
