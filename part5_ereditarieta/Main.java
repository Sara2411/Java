public class Main {

    public static void main (String[]args) {
    
    String tagliaPiccola = Animale.Taglia.PICCOLA.toString();
    String tagliaMedia = Animale.Taglia.MEDIA.toString();  
    String tagliaGrande = Animale.Taglia.GRANDE.toString();

    Gatto1 gatto = new Gatto1();
    gatto.emettiVerso();
    gatto.getNumeroDiZampe();
    gatto.getTaglia(tagliaPiccola);
    
    Tigre tigre = new Tigre();
    tigre.emettiVerso();
    tigre.getNumeroDiZampe();
    tigre.getTaglia(tagliaGrande);

    Chihuahua chihuahua = new Chihuahua();
    chihuahua.emettiVerso();
    chihuahua.getNumeroDiZampe();
    chihuahua.getTaglia(tagliaPiccola);

    Beagle beagle = new Beagle();
    beagle.emettiVerso();
    beagle.getNumeroDiZampe();
    beagle.getTaglia(tagliaMedia);

    Terranova terranova = new Terranova();
    terranova.emettiVerso();
    terranova.getNumeroDiZampe();
    terranova.getTaglia(tagliaGrande);
    
    Corvo corvo = new Corvo();
    corvo.emettiVerso();
    corvo.getNumeroDiZampe();
    corvo.getTaglia(tagliaMedia);

    Passero passero = new Passero();
    passero.emettiVerso();
    passero.getNumeroDiZampe();
    passero.getTaglia(tagliaPiccola);
    
    Millepiedi millepiedi = new Millepiedi();
    millepiedi.emettiVerso();
    millepiedi.getNumeroDiZampe();
    millepiedi.getTaglia(tagliaPiccola);

    }
    
}
