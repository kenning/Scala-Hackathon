object AllAnagrams{
  
  def factorial (n:Int):Int = {
    if (n==0) 1 
    else n * factorial(n-1)
  }
  
  def run (entryString:String): Array[String] = {
    val length = factorial(entryString.length)
    val result = new Array[String](length)
    var counter = 0
    var splitString = entryString.split("")

    def recurse(stringSoFar:Array[String], lettersLeft:Array[String]) {

    }
    result(0) = entryString
    result(1) = entryString.length.toString
    result(2) = splitString(0)
    result
  }

}

println(AllAnagrams.run("hello")(2))

/*incomplete*/