public class ContaVocali {

    public static void contaVocali(String testo) 
    {
    
    int contA = contaA(testo);
    int contE = contaE(testo);;
    int contI = contaI(testo);
    int contO = contaO(testo);
    int contU = contaU(testo);;

    System.out.println("a =" + contA);
    System.out.println("e =" + contE);
    System.out.println("i =" + contI);
    System.out.println("o =" + contO);
    System.out.println("u =" + contU);

    }

    public static int contaA(String testo) {
        int contA = 0;
        for (int k=0; k<testo.length(); k++) {
            if (testo.substring(k, k+1).equals("a")) contA++;
        }
        return contA;
    }  


    public static int contaE(String testo) {
        int contE = 0;
        for (int k=0; k<testo.length(); k++) {
            if (testo.substring(k, k+1).equals("e")) contE++;
        }
        return contE;
    }  


    public static int contaI(String testo) {
        int contI = 0;
        for (int k=0; k<testo.length(); k++) {
            if (testo.substring(k, k+1).equals("i")) contI++;
        }
        return contI;
    } 

    public static int contaO(String testo) {
        int contO = 0;
        for (int k=0; k<testo.length(); k++) {
            if (testo.substring(k, k+1).equals("o")) contO++;
        }
        return contO;
    } 

    public static int contaU(String testo) {
        int contU = 0;
        for (int k=0; k<testo.length(); k++) {
            if (testo.substring(k, k+1).equals("u")) contU++;
        }
        return contU;
    }

}


