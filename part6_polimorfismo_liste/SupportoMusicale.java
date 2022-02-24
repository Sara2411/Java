public class SupportoMusicale {

    private String titoloBrano1;
    private String titoloBrano2;
    private String titoloBrano3;

    public String getTitoloBrano1() {
        return titoloBrano1;
    }

    public void setTitoloBrano1(String titoloBrano1) {
        this.titoloBrano1 = titoloBrano1;
    }

    public String getTitoloBrano2() {
        return titoloBrano2;
    }

    public void setTitoloBrano2(String titoloBrano2) {
        this.titoloBrano2 = titoloBrano2;
    }

    public String getTitoloBrano3() {
        return titoloBrano3;
    }

    public void setTitoloBrano3(String titoloBrano3) {
        this.titoloBrano3 = titoloBrano3;
    }

 
    @Override
    public boolean equals(Object obj) {

        //Controlla se l'oggetto è null
        if (obj == null) {
            return false;
        }
        
        //Controlla se la classe dell'oggetto in input è uguale alla classe in cui siamo
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        
        //Converte(cast)l'oggetto in input in un oggetto della classe(in caso sia true)
        final SupportoMusicale other = (SupportoMusicale) obj;
          
        //Confronta gli attributi degli oggetti
        if (!this.titoloBrano1.equals(other.titoloBrano1) || !this.titoloBrano2.equals(other.titoloBrano2) || !this.titoloBrano3.equals(other.titoloBrano3))  {
            return false;
        }
        
        return true;
    }
  
}
