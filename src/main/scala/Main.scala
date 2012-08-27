package com.slagalica

/**
 *   Main app obj
 */ 
object Main {
  def main(args: Array[String]) {
    try {
      ArgsChecker(args)
    } catch {
      case e: java.lang.IllegalArgumentException => 
        println("Enter at least 3 (three) letters")
        sys.exit()
    }

    val filePath = if(args.length > 1) args(1) else "dict"
    val solution = Slagalica(args(0), 
                      new Dictionary(filePath)
                   ).go

    println(solution)
  }
}
