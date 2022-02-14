public class Somma10 {

	public static void main(String[] args) {
		int i;
		int somma = 0;
		
		for (i=1; i<11; i++) {
			 i = i++;
			 somma = somma + i;
		}
		
		System.out.println(somma);
	}

}
