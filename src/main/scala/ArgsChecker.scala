package com.slagalica

/**
 * Simple cli argument checking 
 * - throws an exce. if arg doesn't fulfill requirements
 */ 
case class ArgsChecker(args: Array[String]) {
  require(args.length > 0 && args(0).length >= 3)
}
