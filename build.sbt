assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

name := "TranslatorApp"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"

assemblyJarName in assembly := "translatorapp-1.0.jar"

mainClass in (Compile, run) := Some("org.translatorapp.TranslatorApp")