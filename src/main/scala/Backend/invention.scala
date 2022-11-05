package Backend

import scala.collection.mutable
import scala.collection.mutable.Buffer

val inventionList = mutable.Buffer[Invention]()

class Invention(val name: String,
                var description: String,
                var stage: String,
                val tagList: mutable.Buffer[String],
                val inventorList: mutable.Buffer[Inventor],
                val supportList: mutable.Buffer[Option[Support]],
               ):
  inventionList.append(this)

  override def toString: String =
    s"[$name]"

def getInventionsWithTag(tag: String) =
  val inventiosWithTag = inventionList.filter(_.tagList.contains(tag))
  inventiosWithTag

