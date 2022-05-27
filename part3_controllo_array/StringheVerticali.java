import java.util.ArrayList;
import java.util.Scanner;

public class StringheVerticali {

static ArrayList<String> listaLettere =  new ArrayList<>();

public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Prima parola: ");
        String parola1 = input.nextLine();
        spezzaStringa(parola1);
        
        System.out.print("Seconda parola: ");
        String parola2 = input.nextLine();
        spezzaStringa(parola2);
        
        System.out.print("Terza parola: ");
        String parola3 = input.nextLine();
        spezzaStringa(parola3);
    }
 
    StampaVerticale(listaLettere);

   } 

    public static void spezzaStringa(String parola) 
    {
    
    for(int i = 0; i< parola.length(); i++)
    {
        String a = parola.substring(i,i+1);
        listaLettere.add(a);
    }

    }

    private static void StampaVerticale(ArrayList<String> listaLettere) {
        for(String s: listaLettere) {
            System.out.println(s);
        }
    }

}
