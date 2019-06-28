object Test22{
  def main(args:Array[String]){
      var a=sub1(9)(3)
      var b=sub2(10)(5)
      println(a);
      println(b);
  }
  def sub1(x:Int)=(y:Int)=>x-y
  def sub2(x:Int)(y:Int)=x-y
}