package zio.graalvm

//import zio._
import zio.test.{suite, test, assert}
import zio.test.junit.JUnitRunnableSpec
import zio.test.Assertion.equalTo
// import zio.test.TestAspect.graalVMOnly
// import zio.test.TestPlatform.{isGraalVM, isJS, isJVM, isNative}
//import scala.jdk.CollectionConverters._

class ZioAppTest extends JUnitRunnableSpec {
  
    override def spec = suite("ZioGraalVM")(
        // test("hello properties") {
        //     for {
        //         _       <- Console.printLine(java.lang.System.getProperties.asScala.mkString("\n"))
        //         output <- TestConsole.output
        //     } yield assert(output)(isNonEmpty)
        // },
        // test("is GraalVM") {
        //     assert(isJS)(equalTo(false)) &&
        //     assert(isJVM)(equalTo(true)) &&
        //     assert(isNative)(equalTo(false)) &&
        //     assert(isGraalVM)(equalTo(true))
        // } @@ graalVMOnly,
        test("hello JVM") {
            assert(true)(equalTo(true))
        },
        // test("hello GraalVM") {
        //     assert(true)(equalTo(false))
        // } @@ graalVMOnly
    )

}
