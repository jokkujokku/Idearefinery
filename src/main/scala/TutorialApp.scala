package refinery

import org.scalajs.dom
import org.scalajs.dom.document

import java.io.File

val filename = "src/main/HTML/index.html"

object TutorialApp:
  def test = ???

  def appendPar(targetNode: dom.Node, text: String): Unit =
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)


  def main(args: Array[String]): Unit =
    appendPar(document.body, "Hello world!")

  def getData(currentFile: File) =
    val name = currentFile.getElementById("name")
    val password = currentDocument.getElementById("password")
    val usersFile = "src/main/scala/Backend/users"

