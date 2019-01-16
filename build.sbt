name := "front2"
organization := "ru.kapinus"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

javaOptions in run ++= Seq(
  "-Xms256",
  "-Xmx256",
  "-XX:+ExitOnOutOfMemoryError",
  "-XX:+IgnoreUnrecognizedVMOptions")

fork := true
fork in run := true