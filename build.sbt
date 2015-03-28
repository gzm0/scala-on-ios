enablePlugins(ScalaJSPlugin)

name := "Scala on iOS POC"

scalaVersion := "2.11.6"

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "0.8.2"

// Mechanisms to generate react file

val genReactFile = Def.taskKey[File]("Generate the file given to react native")

artifactPath in Compile in genReactFile :=
  baseDirectory.value / "index.ios.js"

genReactFile in Compile := {
  val outFile = (artifactPath in Compile in genReactFile).value

  val preamble = "var React = require('react-native');\n"
  IO.write(outFile, preamble)

  val body = IO.read((fastOptJS in Compile).value.data)
  IO.append(outFile, body)

  val launcher = (scalaJSLauncher in Compile).value.data.content
  IO.append(outFile, launcher)

  outFile
}
