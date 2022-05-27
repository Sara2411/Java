public class ArrayMax {
    
    public Double Max(double[] a) {

    Double max = a[0];
    for (int i=0; i<a.length; i++) {
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
    }   
}
