import scala.io.StdIn.readInt;

object q6 extends App{
    def fibo(a : Int) : Int = a match{
        case a if a == 0 => 0;
        case a if a == 1 => 1;
        case _ => fibo(a - 1) + fibo(a- 2);
    }
    def fiboSequence(a:Int):Unit= {
        if (a > 0) fiboSequence(a - 1);
        println(fibo(a));
    }

    print("Enter a value to get fibonacci sequence :");
    var value = readInt();
    fiboSequence(value);
}
