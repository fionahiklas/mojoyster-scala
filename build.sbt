lazy val commonSettings = Seq(
  organization := "com.hiklas.mucking.around",
  version := "0.1.0",
  scalaVersion := "2.12.0",
  libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "Oyster"
  )

