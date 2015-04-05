import scala.scalajs.js

import js.Dynamic.{global => g}
import js.Dynamic.{literal => lit}

object Main extends js.JSApp {
  lazy val React = g.require("react-native")
  lazy val View = g.require("View")
  lazy val Text = g.require("Text")

  def main() = {
    val iOSScala = React.createClass(lit(render = () =>
      React.createElement(View, js.Dynamic.literal(style = js.Dynamic.literal(flex = 1, alignItems = "center", justifyContent = "center",backgroundColor = "#F5FCFF"
      )),
        React.createElement(Text, null, "Welcome to React Native!"),
        React.createElement(Text, null, "To get started, edit Main.scala")
      )
    ))

    React.AppRegistry.registerComponent("iOSscala", () => iOSScala)
  }
}
