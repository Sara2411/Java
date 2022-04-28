public class RicercaBinaria 
{
    public int cerca(int[] array, int elemento)
    {
        return cerca(array, elemento, 0, array.length-1);
    }

    private int cerca(int[] array, int elemento, int a, int b) 
    {
        if(a > b) return -1;

        int meta = (b+a)/2;
        if (array[meta]== elemento) return meta;
        if (elemento <= array[meta]) return cerca(array, elemento, a, meta-1);
        return cerca(array, elemento, meta+1, b);;
    }

}
