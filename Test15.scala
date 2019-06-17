object Test15{
  def main(args:Array[String]){
    var i=0
    show{
      i=i+1
      i
    }
  }
  def show(i: =>Int){
    println(i);
    println(i);
    println(i);
    println(i);
  }
} 