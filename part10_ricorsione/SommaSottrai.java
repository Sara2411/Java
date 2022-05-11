import java.util.ArrayList;

public class SommaSottrai {

    public int calcola(ArrayList<Integer> l)
    {
        int sommaSottrai = 0; 
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 1) {
                sommaSottrai = sommaSottrai + i;
            }
            else {
                sommaSottrai = sommaSottrai - i;
            }
        }   
        return sommaSottrai;
    }

    public static void main(String[] args) {
    SommaSottrai sommaSottrai = new SommaSottrai();
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(2); 
    l.add(3); 
    l.add(5); 
    l.add(7); 
    l.add(11); 
    l.add(1); 
    System.out.println(sommaSottrai.calcola(l));
    }
}
