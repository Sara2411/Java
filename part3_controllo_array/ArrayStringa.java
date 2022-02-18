public class ArrayStringa {

    public boolean controlString (String[] a, String b) {

    boolean c = false;
    
    for (int k=0; k<a.length; k++) {
        if (a[k] == b) {
            c = true;
        }
    }

    return c;

    }   
    
}
