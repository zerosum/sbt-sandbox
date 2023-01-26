import sbt._
import sbt.Keys._

object Settings {

  val baseSettings = Seq(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )
}
