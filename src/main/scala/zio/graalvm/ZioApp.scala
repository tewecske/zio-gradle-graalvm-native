package zio.graalvm

import zio._
import scala.jdk.CollectionConverters._

object ZioApp extends ZIOAppDefault {
    val run = Console.printLine(java.lang.System.getProperties.asScala.mkString("\n"))
}
