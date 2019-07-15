object Test36{
    def main(args:Array[String]){
        var myTuple=(1,11.2345,"Rajitha",'R',true,("Hello",false));
        println(myTuple);

        var tuple1=new Tuple5(1,2,3,4,5);
        println(tuple1);

        println(tuple1._3);

        println(myTuple._6._1);

        myTuple.productIterator.foreach{
            i=>println(i);
       }
    }
}