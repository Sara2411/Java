import java.util.Arrays;

public class MassimoLista {

    public static <T> void max(T x[]) {
    
        System.out.println("Max = " + Arrays.asList(x));
    }   

    public static void main (String[] args) {

        Double [] arr = {1.5, 3.0, 2.5};
        max(arr);
    }  
}
