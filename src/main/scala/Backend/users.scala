package Backend

import scala.collection.mutable
import scala.collection.mutable.Buffer

val userList = mutable.Buffer[User]()

class User(val userName: String, val password: String):
  override def toString: String =
  s"$userName"
  userList.append(this)


class Inventor(userName: String, password: String) extends User(userName, password)

class Support(userName: String,
              password: String,
              val interestedInTags: mutable.Buffer[String]
              ) extends User(userName, password) :

  def takesPartIn =
    inventionList.filter(_.supportList.flatten.contains(this))

  def couldBeInterestedIn =
    val interestedIn = mutable.Buffer[Invention]()
    for tag <- interestedInTags do
      for invention <- inventionList do
        if invention.tagList.contains(tag) then
          interestedIn.append(invention)
    interestedIn


class Expert(userName: String, password: String, interestedInTags: mutable.Buffer[String]) extends Support(userName, password, interestedInTags)

class Investor(userName: String, password: String, interestedInTags: mutable.Buffer[String]) extends Support(userName, password, interestedInTags)

class NonProfitSupport(userName: String, password: String, interestedInTags: mutable.Buffer[String]) extends Support(userName, password, interestedInTags)

class Consumer(userName: String, password: String, interestedInTags: mutable.Buffer[String]) extends Support(userName, password, interestedInTags)