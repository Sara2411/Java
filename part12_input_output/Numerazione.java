import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Numerazione {

    public void numera(File file) {

        File newFile = new File(file + ".num");

        try {
            Scanner in = new Scanner(file);

            while(in.hasNext()) {
                System.out.println(in.nextLine());
                in.close();
            }
        }
        catch(FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        try {
            PrintWriter out = new PrintWriter(newFile);

            out.println("Questa è la prima riga del file");
            out.println("Questa è la seconda riga del file");
            out.print(2);
            out.close();
        }
        catch(FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}