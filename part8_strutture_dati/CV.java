import java.util.Comparator;

public class CV {

    String nome;
    String cognome;
    Autore autore = new Autore(nome, cognome);

    public CV(Autore autore) {
        this.autore = autore;
    }

    public void aggiungiPubblicazione(Pubblicazione pubblicazione) {
    }

    public char[] getAutoriOrdinati(Comparator<Autore> comparator) {
        return null;
    }

    public char[] getAutoriOrdinati() {
        return null;
    }
}
