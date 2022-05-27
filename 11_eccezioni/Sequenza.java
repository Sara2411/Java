import java.util.LinkedList;
		
public class Sequenza {
		    
    LinkedList<Integer> sequenzaGradini;

	public Sequenza(int x) {
		sequenzaGradini = new LinkedList<Integer>();
		sequenzaGradini.add(x);
    }

	public LinkedList<Integer> getSequenzaGradini() {
		return sequenzaGradini;
	}

	public void setSequenzaGradini(LinkedList<Integer> sequenzaGradini) {
		this.sequenzaGradini = sequenzaGradini;
	}
		    
    public void aggiungi(int x) throws Error {

		if (x == sequenzaGradini.getLast() - 1 || x == sequenzaGradini.getLast() + 1) {
		    sequenzaGradini.add(x);
		    } else {
		        throw new Error("Inserire il numero intero precedente o successivo");
		     }
		}  	

    public String toString() {
        String successione = "";
        for (Integer intero : sequenzaGradini) {
            successione = successione + intero + " ";
        }
        return successione;
	}

	public static void main(String[] args) {
		Sequenza sequenza = new Sequenza(8);
		sequenza.aggiungi(7);
		System.out.println(sequenza.toString());
		sequenza.aggiungi(6);
		System.out.println(sequenza.toString()); 
		sequenza.aggiungi(5);
		System.out.println(sequenza.toString()); 
		sequenza.aggiungi(42);
		System.out.println(sequenza.toString());
		} 
}

