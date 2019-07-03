object Test28{
    def main(args:Array[String]){
        var myarray=Array(Array(1,2,3,4),Array(4,5,6,7),Array(7,8,9,0))
        for(i<-0 to 2){
            for(j<-0 to 3){
                print("  "+myarray(i)(j));
            }
                println()
        }
    }
}