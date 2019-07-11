object Test31{
    def main(args:Array[String]){
        var numbers:List[Int]=List(10,20,30,40,50,60,70,80,90,100);
        println(numbers.sum);
        println(numbers.head);
        println(numbers.last);
        println(numbers.tail);//without first element
        println(numbers.reverse);
        println(numbers.length);
        println(numbers.contains(10));
        println(numbers.contains(65));
        println(0::numbers);
        println(numbers);
        println(1::2::Nil);
        println(numbers);

    }
}