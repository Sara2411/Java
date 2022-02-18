public class Room {

    private int numberOfPeople;
    private Counter accessCounter;

    public static void main(String[] args)
    {
       int n = 0;
       Counter myCounter = new Counter();

       System.out.println(n+","+myCounter.toString());

       Room room = new Room();
       System.out.println(room.numberOfPeople);
       System.out.println(room.accessCounter);

    }
}
