public class Pubblicazione {
    
    String titolo;
    int numeroCitazioni;
    private String nome;
    private String cognome;
    Autore autore = new Autore(nome, cognome);
    Autore autore2 = new Autore(nome, cognome);

    public Pubblicazione(String titolo, int numeroCitazioni, Autore autore, Autore autore2) {
        this.titolo = titolo;
        this.numeroCitazioni = numeroCitazioni;
        this.autore = autore;
        this.autore2 = autore2;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumeroCitazioni() {
        return numeroCitazioni;
    }

    public void setNumeroCitazioni(int numeroCitazioni) {
        this.numeroCitazioni = numeroCitazioni;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public Autore getAutore2() {
        return autore2;
    }

    public void setAutore2(Autore autore2) {
        this.autore2 = autore2;
    }
}
