public class Array {
    
    public double sommaArray(double[] a) 
    {
        int val = 0;
        for (int k=0; k < a.length; k++) val += a[k];
        return val;
    }

    public double mediaArray(double[] a) 
    {
        return sommaArray(a)/a.length;
    }
    
}