public class EsercizioHeapStack {
    
    private int k;
    private String a;
    private String b;
    private String c;

    public int getK() {
      return k;
    }

    public void setK(int k) {
      this.k = k;
    }

    public String getA() {
      return a;
    }

    public void setA(String a) {
      this.a = a;
    }

    public String getB() {
      return b;
    }

    public void setB(String b) {
      this.b = b;
    }

    public String getC() {
      return c;
    }

    public void setC(String c) {
      this.c = c;
    }

    public EsercizioHeapStack(int k, String a, String b, String c)
    {
      this.k = k;
      this.a = a;
      this.b = b;
      this.c = c;
    }
    
    public static void main(String[] args)
    {
      EsercizioHeapStack esercizio = new EsercizioHeapStack(5, "aaa", "b", "ccccc");
      System.out.println(esercizio);
    }
}
