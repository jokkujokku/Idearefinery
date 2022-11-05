package Backend

import scala.collection.mutable
import scala.collection.mutable.Buffer

@main def start() =
  readTestData()

//Define test Data
val inventorMatti = Inventor("Matti", "1234")
val inventorPekka = Inventor("Pekka", "0000")
val inventorLiisa = Inventor("Liisa", "1111")

val expertTiina = Expert("Tiina", "3333", mutable.Buffer[String]("web"))

val wheel = Invention(
  "Wheel",
  "Round object",
  "Initial review",
  mutable.Buffer[String]("object", "transportation"),
  mutable.Buffer[Inventor](inventorMatti, inventorLiisa),
  mutable.Buffer[Option[Support]](Some(expertTiina))
)

val pizza = Invention(
  "Pizza",
  "Eatable round object",
  "In-depth support",
  mutable.Buffer[String]("object", "food"),
  mutable.Buffer[Inventor](inventorMatti, inventorPekka),
  mutable.Buffer[Option[Support]](None)
)

val website = Invention(
  "Website",
  "A internet site",
  "Maintenance",
  mutable.Buffer[String]("web"),
  mutable.Buffer[Inventor](inventorLiisa),
  mutable.Buffer[Option[Support]](Some(expertTiina))
)

def readTestData(): Unit =
  println(s"All inventions ${inventionList}")
  println(s"Invention(s) with tag object: ${getInventionsWithTag("object")}")
  println(s"Tiina could be interested in: ${expertTiina.couldBeInterestedIn}")
  println(s"Tiina takes part in: ${expertTiina.takesPartIn}")
end readTestData
