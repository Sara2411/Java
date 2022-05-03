public class SommaRicorsiva
{
    public int somma(int k, int j) 
    {
        if(j==0) return k;
        int s = somma(k, --j);
        s++;
        return s;
    }
}