package com.qbrainx.util
import com.qbrainx.util.DataConversion.{arrayofJson, jsonConversion, listMaker, values}
import spray.json.JsArray

import scala.annotation.tailrec

object JsonFormatter extends App  {
  @tailrec
  def writeJson(b: Int): Unit = {
    val input = io.StdIn.readLine()
    val firstChar: Char = input.charAt(0)
    firstChar match {
      case 'A' => val a = listMaker(input)
                  jsonConversion(a(1))
                  writeJson(b+1)
      case 'R' =>  arrayofJson match {
        case JsArray.empty  => println("JSON Empty")
        case _ => println(arrayofJson.prettyPrint)
      }
                   arrayofJson = JsArray.empty
                   values = Vector.empty
                   writeJson(b+1)
      case _ => println("INVALID INPUT! TRY AGAIN")
                writeJson(b+1)
    }
  }
  writeJson(0)
}
