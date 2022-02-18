public class Triangolo1 {
        
    private double base;

    private double altezza;

    public Triangolo1(double base, double altezza)
    {
        this.base = base;
        this.altezza = altezza;
    } 

    public double getArea()
    {
        return base*altezza/2.0;
    }   

}
