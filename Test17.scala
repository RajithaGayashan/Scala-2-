object Test17{
  def main(args: Array[String]){
      hex(2,3,add)
  }
  def hex(x:Int,y:Int,f:(Int,Int)=>Int){
    var value=f(x,y)
    println(value)
  }

  def add(x:Int,y:Int):Int={
    return x+y
  }
}