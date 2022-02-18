public class ArrayStringa2 {
    
    public int controlString (String[] a, String b) {
    
    int c = 0;

    for (int k=0; k<a.length; k++) {
        if (a[k] == b) 
            c = k;
    }

    return c;

    }   
    
}
