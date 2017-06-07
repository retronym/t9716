package sample

import io.circe._
import io.circe.generic.semiauto._
import io.circe.parser._

final case class User(email: String)

object UserDecode {
  deriveDecoder[User]
}
