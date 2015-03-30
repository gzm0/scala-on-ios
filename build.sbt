enablePlugins(ScalaJSPlugin)

name := "Scala on iOS POC"

scalaVersion := "2.11.6"

// Mechanisms to generate react file

val genReactFile = Def.taskKey[File]("Generate the file given to react native")

artifactPath in Compile in genReactFile :=
  baseDirectory.value / "index.ios.js"

genReactFile in Compile := {
  val outFile = (artifactPath in Compile in genReactFile).value

  IO.copyFile((fullOptJS in Compile).value.data, outFile)

  val launcher = (scalaJSLauncher in Compile).value.data.content
  IO.append(outFile, launcher)

  outFile
}
