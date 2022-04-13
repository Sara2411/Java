import java.util.Arrays;
import java.util.Collections;

public class InvertiLista {
    
    public static <T extends Double> void reverse(T x[]) {
    
        Collections.reverse(Arrays.asList(x));
        System.out.println("ReverseList = " + Arrays.asList(x));
    }   

    public static void main (String[] args) {

        Double [] arr = {1.5, 3.0, 2.5};
        reverse(arr);
    }  
}