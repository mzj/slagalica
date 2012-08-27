package com.slagalica
 
import scala.collection.immutable.HashMap

/**
 * Proxy obj
 */
case class Slagalica(word: String, dict: Dictionary) {
  def go(): String = dict.find(word)
}
