import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Cartella2 {

    public Cartella2(String path) {
    }

    public File cercaFile(String nomeFile) 
    {       
        File f = new File("C:\\example");
        return f;
    }

    public String[] cercaEstensione(File dir,String estensione) {

        FileExtFilter fef = new FileExtFilter(estensione);
        String[] list = dir.list (fef);
        
        for (int i = 0; i < list.length; i++)
        {
        System.out.println (list[i]);
        }
    return list;
    }

    public LinkedList<String[]> cercaEstensioni(File dir, String[] estensioni) {

        LinkedList<String[]> lista = new LinkedList<>();
        for (String estensione : estensioni) {
            String[] trovati = cercaEstensione(dir, estensione);
            lista.add(trovati);
        }
    return lista;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Cartella2 cartella = new Cartella2("CartellaEsercizio");
        File f = cartella.cercaFile("a.txt");
        System.out.println(f.toString());
        File dir = new File("C:"+ "\\" + "Users"+ "\\" + "sara.travaglini" + "\\" + "OneDrive - Accenture" + "\\" + "Desktop" + "\\" + "GitHub" + "\\" + "Java" + "\\" + "part10_ricorsione" + "\\" + "CartellaEsercizio");
        String[] files = cartella.cercaEstensione(dir, ".txt");
        System.out.println(files.length);
        System.out.println("gdbgd");
        for (String file : files) {
            System.out.println("gdbgd");
            System.out.println(file.toString());
        }
        String[] estensioni = {".txt", ".avi"};
        LinkedList<String[]> lista = cartella.cercaEstensioni(dir,estensioni);
        for (String[] estensione : lista) {
            System.out.println(estensione.toString());
        }
    }
}
