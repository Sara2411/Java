import java.io.File;

public class Cartella 
{
    private File cartella;

    public Cartella(String percorso) 
    {
        cartella = new File(percorso);
    }

    private String getSpazi(int k) 
    {
        StringBuffer sb = new StringBuffer();
        while(k-- > 0) sb.append(" ");
        return sb.toString();
    }

    @Override
    public String toString() 
    {
        return getElencoFile(cartella, 0);
    }

    private String getElencoFile(File c, int profondita)
    {
        StringBuffer sb = new StringBuffer();
        for (File f: c.listFiles())
        {
            sb.append(getSpazi(profondita));
            if(f.isDirectory())
            {
                sb.append("<");
                sb.append(f.getName());
                sb.append(">\n");

                sb.append(getElencoFile(f, profondita+1));
            }
            else
            {
                sb.append(f.getName());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
