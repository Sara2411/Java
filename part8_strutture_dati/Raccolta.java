import java.util.HashSet;

public class Raccolta {

    public static void main(String[] args) {

    HashSet<String> canzoni = new HashSet<String>();

    canzoni.add("L'Aurora");
    canzoni.add( "Ci sono anch'io");
    canzoni.add("Girasole");


    Canzoni canzone1 = new Canzoni();
    Canzoni canzone2 = new Canzoni();
  
    System.out.println( "Equals: " + canzone1.equals(canzone2));
    System.out.println( "canzone1 hashCode:" + canzone1.hashCode() );
    System.out.println( "canzone2 hashCode:" + canzone2.hashCode() );

    System.out.println(canzone1.toString());
    System.out.println(canzone2.toString());
}

}
