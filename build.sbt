ThisBuild / scalaVersion := "2.13.10"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.zerosum"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    Docker / mainClass    := Some("dev.zerosum.Main"),
    name                  := "sbt-sandbox",
    dockerBaseImage       := "openjdk:11-jdk-slim",
    dockerBuildxPlatforms := Seq("linux/amd64", "linux/arm64"),
    Docker / packageName  := "z3r05um/sandbox",
    dockerUpdateLatest    := true
  )
