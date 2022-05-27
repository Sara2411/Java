import java.util.function.Function;

public class ElencoDiRoutine {

    static Function<String, Integer> lunghezzaFunction = String::length;
    static Function<String, Integer> yFunction = ElencoDiRoutine::contaY;
    static Function<String, Integer> interoFunction = Integer::parseInt;
    static Function<String, Integer> sommaFunction = ElencoDiRoutine::sommaCaratteri;

    public static int contaY(String parola) {

    int contaLettera = 0;
    char temp;

        for (int i=0; i<parola.length();i++) {

        temp = parola.charAt(i);

            if(temp == 'y') {
                contaLettera++;
            }
        }
    return contaLettera;
    }

    public static int sommaCaratteri(String parola){
        
		int contaSomma = 0;
		int numero = 0;
		char c;
		for (int i=0; i< parola.length(); i++){

			c = parola.charAt(i);

			if (c >= '0' && c <= '9'){
				numero = c - '0';
			}
			else{
				numero = 0;
			}
			contaSomma = contaSomma + numero;	
		}
		return contaSomma;	
	}

    public static void esegui(String parola) {

    System.out.println(lunghezzaFunction.apply(parola));
    System.out.println(yFunction.apply(parola));
    System.out.println(interoFunction.apply(parola));
    System.out.println(sommaFunction.apply(parola));   
    }

    public static void main(String[] args) {

        ElencoDiRoutine.esegui("Yes");  
    }
}
