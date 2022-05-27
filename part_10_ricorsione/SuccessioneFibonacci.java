import java.lang.Exception;

public class SuccessioneFibonacci {

    public int fib(int x) throws Exception
    {
        if(x < 0) throw new Exception();
        if(x == 0 | x == 1) return x;
        return fib(x-1)+(x-2);
    }
}