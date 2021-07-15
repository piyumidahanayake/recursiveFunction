import scala.io.StdIn.readInt;

object q4 extends App {
    def check(p:Int) : Unit = {
        if(p%2 == 0) {
            print(p);
            printf(" is even\n");
        }
        else if(p%2 != 0) {
            print(p);
            printf(" is odd\n");
        }
        if(p > 1)
        check(p - 1);
    }

    print("Enter a number to get odd even values: ");
    var value = readInt();
    check(value);
}
