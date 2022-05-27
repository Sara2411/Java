import java.io.DataInput;

public class Floppy {

    public int posizionaTestina(int posizione, String testina) {

        for(int k =0; k<testina.length(); k++) {
            posizione = posizione + k;
        }
    return posizione;
    }

    public void leggi(Byte x) throws Exception {
    }

    public void scrivi(Byte x) throws Exception {
        System.out.println(x);
    }

    public void formatta(DataInput dati) throws Exception {
    }

    public void attivaBloccoScrittura() {
    }

    public void disattivaBloccoScrittura() {
    }
}