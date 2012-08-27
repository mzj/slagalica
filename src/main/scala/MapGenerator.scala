package com.slagalica

import scala.io.Source._ 
import scala.collection.immutable.HashMap

/**
 *  Responsible for generating map from list of words 
 */
object MapGenerator {

  /**
   * Generates map of words from file source
   */
  def generateFromFile(file: scala.io.BufferedSource): Map[String, Map[Char, Int]] = {
      val res = file.getLines.foldLeft(HashMap[String, HashMap[Char, Int]]()) {
                  (m, i) => m + ((i, StringMapper.mapString(i)))
                }
      file.close()
      res
  }
}
