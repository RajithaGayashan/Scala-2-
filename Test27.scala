object Test27{
    def main(args:Array[String]){
        var myarray=Array.ofDim[Int](3,4)  
            for(i <-0 to 2){
                for(j <-0 to 3){
                    myarray(i)(j)=i;
                }
            }

            for(i <-0 to 2){
                for(j <-0 to 3){
                    print("  "+myarray(i)(j))
                }
                println()
            }
        
    }
}