object Test37{
    def main(args:Array[String]){
        var l1=List(1,2,3,4,5);
        var l2=List(10,20,30);
        var l3=l1:::l2;
        println(l3); 


        var s1=Set(1,2,3);
        var s2=Set(10,20,30);
        var s3=s1++s2;
        println(s3); 

        
    }
}