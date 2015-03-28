import scala.scalajs.js

import js.Dynamic.{global => g}
import js.Dynamic.{literal => lit}

object Main extends js.JSApp {
  lazy val React = g.require("react-native")
  lazy val View = g.require("View")
  lazy val Text = g.require("Text")

  def main() = {
    val iOSScala = React.createClass(lit(render = () =>
      React.createElement(View, null,
        React.createElement(Text, null, "Welcome to React Native!"),
        React.createElement(Text, null, "To get started, edit Main.scala")
      )
    ))

    React.AppRegistry.registerComponent("iOSscala", () => iOSScala)
  }
}
