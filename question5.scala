import scala.io.StdIn.readInt;

object q5 extends App {
    var q:Int = 0;
    def sum(p:Int): Unit= {
        if(p > 0) {
        if(p%2 == 0) {
            q = q + p;
        }
        sum(p - 1);
        }
        else print(q);
    }

    print("Enter a value:");
    var value = readInt();
    sum(value-1);

}
