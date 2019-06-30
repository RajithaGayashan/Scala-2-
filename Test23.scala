object Test23{
  def main(args:Array[String]){
    println(closure_sum(20));
  }
    var value=10;
  def closure_sum(x:Int):Int={
    var sum=50+value;
    return sum;
  }


}