name := "scala-sweble-bug"

version := "0.1"

crossScalaVersions := Seq("2.11.12", "2.12.6", "2.13.0")

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.sweble.wikitext" % "swc-engine" % "3.1.9",
  "de.fau.cs.osr.ptk" % "ptk-common" % "3.0.8"
)