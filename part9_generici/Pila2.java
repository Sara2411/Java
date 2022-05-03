import java.util.Arrays;

public class Pila2<T>
{
    static final public int INITIAL_SIZE = 5;
    private T[] a;
    private int k = -1;

    @SuppressWarnings("unchecked")
    public Pila2()
    {
        a = (T[]) new Object[INITIAL_SIZE];
    }

    public void push(T o)
    {
        if (this.k == a.length -1) a = Arrays.copyOf(a, a.length*2);
        a[++k] = o;
    }

    public Object peek()
    {
        if (k == -1) return null;
        return a[k];
    }

    public Object pop()
    {
        if(k == -1) return null;
        return a[k--];
    }


    public static void main (String[] args) {

        Pila2 p = new Pila2();
        p.push(1);
        p.push(2);
        Object k = p.pop();
    }  
}

