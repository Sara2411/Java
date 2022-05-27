import java.util.*;

public class ChatBotNonCosiInterattivo {
    public static void main(String[] args)
    {
    
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Come ti chiami?");

            String nome = input.nextLine();

            System.out.println("Ciao "+nome+"!");
        }
    }
    
}
