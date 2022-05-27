public class Counter {

    private int value;
    
    public Counter()
    {
        value=0;
    }

    public void count()
    {
        value++;
    }

    public int getValue() 
    {
        return value; 
    }

    public void setValue(int value) {
        this.value = value;
    }

}