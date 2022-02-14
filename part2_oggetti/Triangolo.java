public class Triangolo {
        
    private double base;

    private double altezza;

    public Triangolo(double base, double altezza)
    {
        this.base = base;
        this.altezza = altezza;
    } 

    public double getArea()
    {
        return base*altezza/2.0;
    }   

}
