package com.slagalica

import scala.collection.immutable.HashMap

/*
 *  Maps string to the map - holds the char as key
 *  and number of occurrences of that char as value
 */
object StringMapper {
  def mapString(str: String) = {
    require(str.length > 0)  
    str.foldLeft(HashMap[Char, Int]()) ((map, ch) => map.updated(ch, map.getOrElse(ch, 0) + 1))
  }
}
