import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class Albero {

    List<Nodo> nodi = new ArrayList<>();
    List<Integer> interi = new ArrayList<>();
    private Nodo root;
    private Nodo nodo1;
    private Nodo nodo2;
    private Nodo nodoN;
    private boolean b;

    static public class Nodo 
    {
        private int valore;
        
        public Nodo(int valore) {
            this.valore = valore;
        }
    }

    public boolean contains(int val) 
    {
        if(nodoN.valore==val) {
            b = true;
        } else {
            b = false;
        }
    return b;
    }

    public void add(Nodo n) 
    {
        if(!nodi.contains(n)) {
            nodi.add(n);
        }
    }

    public void addNodi(int n1, int n2, int n) throws Exception
    {
        if(n1 == root.valore) {
            nodi.add(nodo1);
        }
        if(n2 != nodo2.valore)  {
            interi.add(n2);
        }
        if(n != nodoN.valore)  {
            interi.add(n);
        }
    }

    public void remove(int n) {

        if(n == nodoN.valore) {
            nodi.remove(nodoN);
            if (n == root.valore) {
                nodo1 = root;
            }
        }
    }
}
