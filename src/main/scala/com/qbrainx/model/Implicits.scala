package com.qbrainx.model

import spray.json.{DefaultJsonProtocol, RootJsonFormat}

object Implicits extends DefaultJsonProtocol{
  implicit val dataFormat: RootJsonFormat[Data] = jsonFormat2(Data)
}
