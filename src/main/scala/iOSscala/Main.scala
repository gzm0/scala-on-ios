import scala.scalajs.js

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object Main extends js.JSApp {
  def main() = {
    val HelloMessage = ReactComponentB[String]("HelloMessage")
      .render(name => <.div("Hello ", name))
      .build

    React.render(HelloMessage("John"), ???)
  }
}
