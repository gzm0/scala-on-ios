import scala.scalajs.js

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Main extends js.JSApp {
  def main() = {
    val emptyObj = js.Dynamic.literal()
    val iOSScala = ReactComponentB.static("HelloMessage",
      React.createElement("View", emptyObj,
        React.createElement("Text", emptyObj,
          "Welcome to React Native!"),
        React.createElement("Text", emptyObj,
          "To get started, edit Main.scala")
      )
    ).build

    // Register application
    React.asInstanceOf[js.Dynamic].AppRegistry.registerComponent(
      "iOSscala", () => iOSScala)
  }
}
