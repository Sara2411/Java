import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIntegerList { 

    private static List<Integer> numeri = new ArrayList<>();

        public static final void main(String[] args) {
        
        numeri.add(12);
        numeri.add(14);
        numeri.add(16);

        Iterator<Integer> iterator = numeri.iterator();

        while(iterator.hasNext()) {
            int element = iterator.next();
            System.out.println( element );
        }
    }     
}