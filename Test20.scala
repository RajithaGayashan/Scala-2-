object Test20{
  def main(args:Array[String]){
    var x=factorial(4);
    print(x);
  }
  def factorial(n:Int):Int={
    if(n==0){
      return 1;
    }else{
      return n*factorial(n-1)
    }
  }
}