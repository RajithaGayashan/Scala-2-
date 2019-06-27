object Test21{
  def main(args:Array[String]){
    var x=add(20,5,5)
    println(x)
  }

  def add(x:Int,y:Int,z:Int):Int={
      def add1(a:Int,b:Int):Int={
        a+b 
      }
      add1(x,add1(y,z))
  }
}