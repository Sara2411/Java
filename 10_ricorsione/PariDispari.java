import java.util.ArrayList;

public class PariDispari 
{
    public boolean pariDispari(ArrayList<Integer> l)
    {
        return pariDispari(l,0);
    }

    private boolean pariDispari(ArrayList<Integer> l, int k)
    {
        if (k == l.size()) return true;
        return (l.get(k) % 2 == 0) && dispariPari(l, k+1);
    }

    private boolean dispariPari(ArrayList<Integer> l, int k)
    {
        if (k == l.size()) return true;
        return (l.get(k) % 2 == 1) && pariDispari(l, k+1);
    }
}