scalaVersion in ThisBuild := "2.12.2"

val macros = project.settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

val client = project.dependsOn(macros).settings(
  libraryDependencies += "io.circe" %% "circe-core" % "0.8.0",
  libraryDependencies += "io.circe" %% "circe-generic" % "0.8.0",
  libraryDependencies += "io.circe" %% "circe-parser" % "0.8.0"
)
