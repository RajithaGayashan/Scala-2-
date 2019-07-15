object Test34{
    def main(args:Array[String]){
        var marks1:Set[Int]=Set(10,20,30);
        var marks2=Set(79,88,76,80,50,10,20,30);
        println(marks1)
        println(marks1(10))
        for(num<-marks1){
            println(marks1);
        }
        println(marks1.min);
        println(marks1.max);
        println(marks1.isEmpty);
        var name:Set[String]=Set("Matara","Galle","Colombo");
        name.foreach(println);
        println(marks2.tail);
        println(marks2.head);
        println(marks2.last);
        var marks3=marks1++marks2;
        println(marks1.&(marks2))
    }
}