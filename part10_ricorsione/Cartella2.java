import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.nio.file.Path;

public class Cartella2 {

    private String path;

    public Cartella2(String path) {
        this.path = path;
    }

    public File cerca(String nomeFile) { 

        File f = new File("C:\\example");
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
        return name.startsWith("temp") && name.endsWith("txt");
        }
        });
    return f;
    }

    /*public String cerca(String estensione) {
    }

    public String cerca(List<String> estensioni) {
    }*/

    public static void main(String[] args) throws FileNotFoundException {
        Cartella2 cartella = new Cartella2("CartellaEsercizio");
        cartella.cerca("a.txt");
    }
}

