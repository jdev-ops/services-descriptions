val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "services-descriptions",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq()
  )
