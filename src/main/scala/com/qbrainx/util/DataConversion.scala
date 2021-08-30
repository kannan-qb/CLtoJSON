package com.qbrainx.util
import com.qbrainx.model.Data
import com.qbrainx.model.Implicits.dataFormat
import spray.json.{JsArray, JsValue,enrichAny}

object DataConversion {
  protected[JsonFormatter] var arrayofJson: JsArray =JsArray.empty
  protected[JsonFormatter] var values: Vector[JsValue] = Vector.empty
  def dataConversion(s: String): Data = {
    s.split(",") match {
      case Array(str1, str2) =>
        Data(str1.replace("(",""), str2.replace(")","").toInt)
    }
  }
  def listMaker(str:String): List[String] =
    str.split("->").toList

  def jsonConversion(stringValue:String): String = {
    val add:JsValue =dataConversion(stringValue).toJson
    values=values.appended(add)
    arrayofJson=JsArray.apply(values)
    arrayofJson.prettyPrint
  }
}
