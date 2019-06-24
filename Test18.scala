object Test18{
  def main(args:Array[String]){
      hExample(2,3,(x,y)=>x+y)
  }

  def hExample(x:Int,y:Int,f:(Int,Int)=>Int){
      val value=f(x,y)
      println(value)
  }
}