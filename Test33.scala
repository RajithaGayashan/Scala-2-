object Test33{
    def main(args:Array[String]){
        var names:Map[Int,String]=Map(1->"Rajitha",2->"Gayashan");
        println(names);
        names+=3->"Colombo"
        println(names);
        names+=3->"Matara"
        println(names(3));
        names.keys.foreach{i=>
         print("key "+i)
         println(" value "+names(i));


        println(names.keys)
        println(names.values)
        println(names.isEmpty)
        println(names.contains(6));
        }
    }
}