object Test25{
    def main(arrgs:Array[String]){
        var myarray=new Array[Int](3);
        myarray(0)=10;
        myarray(1)=12;
        myarray(2)=80;
        for(x<-myarray){
            println(x);
        }
    }
} 