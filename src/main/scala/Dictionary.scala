package com.slagalica

import scala.io.Source._ 
import scala.collection.immutable.HashMap

/**
 *   Holds mapped words and finds the best match 
 *   for the given string of letters
 */
class Dictionary(fileName: String) {

  /**
   *  Mapped words from file
   */
  val data = MapGenerator.generateFromFile(fromFile(fileName))

  /**
   * The main method - finds the best match and return it to the caller
   */
  def find(word: String): String = {
    if(data.contains(word)) return word

    val wordMap = StringMapper.mapString(word)

    data.foldLeft("") { 
      (s, w) => if (w._1.length > s.length && compare(wordMap, w._2)) w._1 else s
    }

  }

  /**
   *   Compares mapped words
   */
  def compare(m1: Map[Char, Int], m2: Map[Char, Int]): Boolean = {
    m2.foldLeft(true) {
      (res, e1) => m1.exists((e2: (Char, Int)) => 
              e2._1 == e1._1 && e2._2 >= e1._2 && res == true
            )
    }

  }
}
