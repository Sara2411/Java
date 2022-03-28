import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Multimappa {

    private static Map<String, Integer> mappa = new TreeMap<String,Integer>();
    private static Map<String,Integer> map = new LinkedHashMap<>();

    public static void main(String[]args) {

    mappa.getOrDefault("a", 0);
    mappa.getOrDefault("b", 0);
    mappa.getOrDefault("c", 0);
    mappa.put("a",1);
    mappa.put("b",2);
    map.put("A", 3);
    map.put("B", 4);

    System.out.println(mappa.keySet());
    System.out.println(mappa.values());
    System.out.println(map.values());
    }
    
}
