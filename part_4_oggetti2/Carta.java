public enum Carta 
{
    ASSO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5), SEI(6), SETTE(7), OTTO(8), NOVE(9), DIECI(10), JACK(11), DONNA(12), RE(13);

    private int carta;

    Carta(int carta) {this.carta = carta; }
    public int toInt() {return carta; }

}
