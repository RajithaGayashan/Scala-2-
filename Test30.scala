object Test30{
        def main(args:Array[String]){
            var colors:List[String]=List("Red","Blue","Black");  //String values
            println(colors);  
            println();

            var numbers:List[Int]=List(10,30,70);  //Integer values
            println(numbers);
            println();

            for(num<-numbers){  //Using for loop
                println(num);
                
            }
            println();

            colors.foreach(println);  //Using foreach loop
            println();
            colors.foreach(println(_));
            println();


            var sum=0;
            numbers.foreach(sum+=_);
            println("Sum = "+sum);







        }
}