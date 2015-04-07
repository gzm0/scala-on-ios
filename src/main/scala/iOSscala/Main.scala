import scala.scalajs.js

import js.Dynamic.{global => g}
import js.Dynamic.{literal => lit}

object Main extends js.JSApp {
  lazy val React = g.require("react-native")
  lazy val View = g.require("View")
  lazy val Text = g.require("Text")



  def main() = {
    val iOSScala = React.createClass(lit(render = () =>
      React.createElement(View, container,
        React.createElement(Text, welcome, "Welcome to React Native!"),
        React.createElement(Text, instructions, "To get started, edit Main.scala")
      )
    ))

    React.AppRegistry.registerComponent("iOSscala", () => iOSScala)
  }

  val container = lit(
    style = lit(
      flex = 1,
      alignItems = "center",
      justifyContent = "center",
      backgroundColor = "#F5FCFF"
    ))

  val welcome = lit(
    style = lit(
      fontSize = 20,
      textAlign =  "center",
      margin = 10
    )
  )

  val instructions = lit(
    style = lit(
      textAlign = "center",
      color = "#333333",
      marginBottom = 5
    )
  )

}
