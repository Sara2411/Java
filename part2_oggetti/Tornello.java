public class Tornello {
   
    static private int passaggi;

    public void passa() { passaggi++; }
    public static int getPassaggi() { return passaggi; }

    public static void main (String[] args)
    {
     Tornello t1 = new Tornello();
     t1.passa();
     Tornello t2 = new Tornello();
        for (int k = 0; k <10; k++) {
             t2.passa();
        }
    }

}
