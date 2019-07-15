object Test32{
    def main(args:Array[String]){
        var numbers:List[List[Int]]=List(List(1,2,3,4,5),List(10,20,30,40,50),List(100,200,300,400,500));
        println(numbers);
        println(numbers(0)(1));
        println(numbers(1)(1));
        println(numbers(2)(4));


    }
}