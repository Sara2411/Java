public class ContaIstanze {

    static private int numberOfIstances;

    public ContaIstanze() 
    {
       numberOfIstances++;
    }
    
    public static void main(String[] args)
    {
      new ContaIstanze();
      new ContaIstanze();
      new ContaIstanze();

      System.out.println("Numero di istanze create finora: "+numberOfIstances);
    }
}
