import scala.io.StdIn.readInt;

object q3 extends App {
    var q:Int = 0;
    def sum(p:Int): Unit={
        q = q + p;
        if(p>0) sum(p - 1);
        else print(q);
    }

    print("Enter a value:");
    var value = readInt();
    sum(value);
}
