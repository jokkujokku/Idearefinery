ThisBuild / version := "0.1.0-SNAPSHOT"


ThisBuild / scalaVersion := "3.2.1"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

lazy val root = (project in file("."))
  .settings(
    name := "Idearefinery"
  )
