object HelloWorld{
  
  /*1. Variables*/
  val s = "Hello scala"
  
  /*2. Conditionals*/
  if(s == "Hello scala") {
    println(s)
  }

  /*3. Collections*/
  var arr = Array(1, 2, 3)

  /*4. Loops*/
  /*5. Functions*/
  def loop : Unit = {
    for ( x <- arr ){
      println(x)
    }
  }
  /*6. Where are the Docs?*/
  val docs = "http://docs.scala-lang.org/"
  
  /*7. How do I execute the code?*/

  object privateInfo{
    private var counter : Int = 4
    def printCounter() {
      println(counter)
      counter = counter + 1
    }
  }  
}
HelloWorld.loop
HelloWorld.privateInfo.printCounter
HelloWorld.privateInfo.printCounter
HelloWorld.privateInfo.printCounter

