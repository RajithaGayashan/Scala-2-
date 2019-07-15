import scala.collection.mutable._
object Test35{
    def main(args:Array[String]){
        var marks1=Queue(1,2,3,4,5);
        var marks2=Queue(10,20,30,40,50);
        println(marks1);
        println(marks2);
        marks1.enqueue(6);
        println(marks1);
        marks1.dequeue();
        println(marks1);
        println(marks1++(marks2));
        println(marks1.contains(1));
        println(marks1+=(7));
        println(marks1.tail);
        println(marks1.last);
        println(marks1.head);
        println(marks1.isEmpty);
        println(marks1.filter(3<));
        println(marks1.count(5<));

    }
}