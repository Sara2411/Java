public enum MazzoDiCarte 
{
    CUORI("C"), QUADRI("Q"), FIORI("F"), PICCHE("P");

    private String seme;

    MazzoDiCarte(String seme) {this.seme = seme; }
    public String toString() {return seme; }

}