public class Room {

    static private int totalNumberOfPeople;

    private int numberOfPeople;
    private Counter accessCounter;

    public static void main(String[] args)
    {
       int n;
       Counter myCounter;

       System.out.println(n+","+myCounter);

       Room room = new Room();
       System.out.println(room.numberOfPeople);
       System.out.println(room.accessCounter);

       Room room1 = new Room();
       Room room2 = new Room();
    }
}
