import java.util.Scanner;

public class StringaVerticale {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String parola = input.nextLine();
    String[] tokens =  parola.split(" ");
    System.out.print(parola);
}
}
