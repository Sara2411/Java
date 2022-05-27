import java.util.Arrays;

public class Pila<T> 
{
    static final public int INITIAL_SIZE = 5;
    private T[]a;
    private int k = -1;

    @SuppressWarnings("unchecked")
    public Pila()
    {
        a = (T[]) new Object[INITIAL_SIZE];
    }

    public void push (T o)
    {
        if (k == a.length -1) a = Arrays.copyOf(a, a.length*2);
        a[++k] = o;
    }

    public T peek()
    {
        if (k == -1) return null;
        return a[k];
    }

    public T pop()
    {
        if(k == -1) return null;
        return a[k--];
    }
 
    public static void main (String[] args) {

        Pila<Integer> p = new Pila<>();
        p.push(1);
        p.push(2);
        p.pop();
    }  
}