public class Concatenazione {

    public String concatena(String[]array) {

    String risultato = "";
    for (int i=0; i<array.length; i++) {
        risultato += array[i];
    }   
    return risultato;
    }

    public static void main(String[] args) {
        Concatenazione concatenazione = new Concatenazione();
        String[] array = {"abc", "de", "f"};
        String stringa = concatenazione.concatena(array);
        System.out.println(stringa);
    }
}
