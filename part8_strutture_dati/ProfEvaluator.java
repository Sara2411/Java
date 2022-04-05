import java.util.Comparator;

public class ProfEvaluator {

    int number;
    
    public ProfEvaluator(CV cv) {
    }

    public static void main(String[]args) 
    {
        CV cv = new CV(new Autore("pinco","pallo"));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 10, new Autore("pinco", "pallo"), new Autore("mario", "rossi")));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 7, new Autore("pinco", "pallo"), new Autore("giuseppe", "verdi")));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 5, new Autore("pinco", "pallo"), new Autore("pinco", "pallo")));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 4, new Autore("pinco", "pallo"), new Autore("pinco", "pallo")));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 3, new Autore("pinco", "pallo"), new Autore("signor", "anderson")));
        cv.aggiungiPubblicazione(new Pubblicazione("publ1", 3, new Autore("pinco", "pallo"), new Autore("pinco", "pallo")));

        ProfEvaluator eval = new ProfEvaluator(cv);
        System.out.println(eval.getHindex());
        System.out.println(cv.getAutoriOrdinati());
        System.out.println(cv.getAutoriOrdinati(Comparator.comparing(Autore::getNome).thenComparing(Autore::getCognome))); 
    }

    private int getHindex() {
        return number;
    }
}
