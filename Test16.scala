object Test16{
  def main(args:Array[String]){
    var result=(a:Int,b:Int) => a+b
    println(result(10,20));

    var result1=(_:Int)+(_:Int)
    println(result1(1,2))
  }
} 