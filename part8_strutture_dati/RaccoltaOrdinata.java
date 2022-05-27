import java.util.TreeSet;

public class RaccoltaOrdinata {

    public static void main (String[] args) {

    TreeSet<String> nomi = new TreeSet<String>();
    TreeSet<String> autori = new TreeSet<String>();

    nomi.add("Destinazione Paradiso");
    nomi.add("Non è l'inferno");
    nomi.add("Destinazione Paradiso");
    autori.add("Laura Pausini");
    autori.add("Emma Marrone");
    autori.add("Gianluca Grignani");

    System.out.println(nomi);
    System.out.println(autori);
 
   }
    
}
