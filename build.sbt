name := "Idearefinery"
scalaVersion := "3.2.1"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

//defines root
lazy val root = (project in file("."))
  .settings(
      name := "Idearefinery"
)

//DOM
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"

//Scalatags
libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.12.0"