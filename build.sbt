name := "play2-scala-template"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
