import java.util.Arrays;

public class Pila2 
{
    static final public int INITIAL_SIZE = 5;
    private Object a;
    private int k = -1;

    @SuppressWarnings("unchecked")
    public Pila()
    {
        a = (Object[]) new Object[INITIAL_SIZE];
    }

    public void push (Object o)
    {
        if (k == a.length -1) a = Arrays.copyOf(a, a.length*2);
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

        Object Pila p = new Object Pila(10);
        p.push(1);
        p.push(2);
        Object k = p.pop();
    }  
}

