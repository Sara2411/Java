public class Cruciverba {

    private static char[][] tabella;
    public char getCarattere(int x,int y) { return tabella[y][x]; }
    public static void main(String[] args)
    {
       tabella = new char[10][10];
    }
}
