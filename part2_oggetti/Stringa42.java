public class Stringa42{
    String s1;
    String s2;
    String s3;
    String s;
    String sub;
    boolean a;
    boolean b;

  public Stringa42() {
  }

    public void magicaStringa(String s1, String s2, String s3) {
    
    s = s1 + " " + s2 + " " + s3; 
    sub = s.substring(0,43);
    
    System.out.println(sub.length());

    System.out.println(sub.charAt(0));
 
    if (sub.equals("42")) {
      a = true;
    } else {
      a = false;
    }
    
    if (sub.indexOf("42") != -1) {
      b = true;
    } else {
      b = false;
    }
    
    System.out.println(a);

    System.out.println(b);

    } 

} 