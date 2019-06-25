object Test19{
  def main(args:Array[String]){
    //var b=mul(2,4,3)
    //println(b)

    var b=mul(_:Int,4,_:Int){
    println(b(2,3))  
    }
  }
  def mul(x:Int,y:Int,z:Int):Int={
    var a=x*y*z
    return a
  }
}