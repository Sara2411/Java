public class RiproduttoreMusicale {
    
    private SupportoMusicale s;
    private String nomeBranoSelezionato;
    private String nomeBranoInEsecuzione;
    private String nomeBrano;
    
    public void inserisciSupporto (SupportoMusicale supportoMusicale) {
        s = supportoMusicale;
    }

    public void espelliSupporto (SupportoMusicale supportoMusicale) {
        s = null;
    }
    
    public void selectBrano(String nomeBrano) {
        nomeBranoSelezionato = nomeBrano;
    }

    public String getBrano() {
        nomeBrano = nomeBranoInEsecuzione;
        return nomeBrano;
    }

    public void play() { 
        nomeBranoInEsecuzione = nomeBranoSelezionato;
    }
   
    public void stop() {
        nomeBranoInEsecuzione = null;
    }
         
    public int prev(int numeroBrano) {
        numeroBrano = numeroBrano-1;
        return numeroBrano;
    }

    public int next(int numeroBrano) {
        numeroBrano = numeroBrano+1;
        return numeroBrano;
    }

    public String toString() {
        return nomeBrano;
    }

}