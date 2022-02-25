public class SupportoMusicale {

    private String nomeBrano1;
    private String nomeBrano2;
    private String nomeBrano3;

    public String getnomeBrano1() {
        return nomeBrano1;
    }

    public void setnomeBrano1(String nomeBrano1) {
        this.nomeBrano1 = nomeBrano1;
    }

    public String getnomeBrano2() {
        return nomeBrano2;
    }

    public void setnomeBrano2(String nomeBrano2) {
        this.nomeBrano2 = nomeBrano2;
    }

    public String getnomeBrano3() {
        return nomeBrano3;
    }

    public void setnomeBrano3(String nomeBrano3) {
        this.nomeBrano3 = nomeBrano3;
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
        if (!this.nomeBrano1.equals(other.nomeBrano1) || !this.nomeBrano2.equals(other.nomeBrano2) || !this.nomeBrano3.equals(other.nomeBrano3))  {
            return false;
        }
        
        return true;
    }
  
}
