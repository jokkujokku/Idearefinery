package refinery

import org.scalajs.dom
import org.scalajs.dom.document

val filename = "src/main/HTML/index.html"

object TutorialApp:
  def test = ???

  def appendPar(targetNode: dom.Node, text: String): Unit =
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)


  def main(args: Array[String]): Unit =
    appendPar(document.body, "Hello world!")