package refinery

import org.scalajs.dom
import org.scalajs.dom.document

val filename = "src/main/HTML/index.html"

object TutorialApp:
  def initialList(targetNode: dom.Node): Unit =
    val parNode = document.createElement("ul")



  def appendPar(targetNode: dom.Node, text: String): Unit =
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)


  def main(args: Array[String]): Unit =
    appendPar(document.body, "Hello world!")