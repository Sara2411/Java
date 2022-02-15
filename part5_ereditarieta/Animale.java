public abstract class Animale {

    public void emettiVerso() {
    }

    public void getNumeroDiZampe() {
    }

    public enum Taglia 
    {
      PICCOLA,
      MEDIA,
      GRANDE;
    }

    public void getTaglia(Taglia t) 
    {
      switch(t)
      {
         case PICCOLA: System.out.println("Taglia piccola");
         case MEDIA: System.out.println("Taglia media");
         case GRANDE: System.out.println("Taglia grande");
      }
    }
}
