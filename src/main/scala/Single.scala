package spa

import org.scalajs.dom
import org.scalajs.dom.document
import scalatags.JsDom.all._

object Single:
  def main(args: Array[String]): Unit =
    val btn = button(
      "test",
      onclick := ( dom.window.alert("test") )
    )

    val content =
      div(cls := "foo",
        div(cls:= "bar",
          h2("Hello"),
          btn ))

    val root = dom.document.getElementById("root")
    root.innerHTML = ""
    root.appendChild(content.render)
  end main

end Single