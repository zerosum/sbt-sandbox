ThisBuild / scalaVersion := "2.13.10"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.zerosum"

lazy val root = (project in file(".")).aggregate(child1, child2)

lazy val child1 = (project in file("./child1"))
  .settings(
    Settings.baseSettings
  )
lazy val child2 = (project in file("./child2"))
  .settings(
    Settings.baseSettings
  )
