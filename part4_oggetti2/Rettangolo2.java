public class Rettangolo2 extends Forma
{
    
    private double base;
    private double altezza;
    
    public Rettangolo2(double base, double altezza)
    {
      this.base = base;
      this.altezza = altezza;
    }

    public double getBase()
    {
      return base;
    }

    public double getAltezza()
    {
      return altezza;
    }

    public double getPerimetro()
    {
        return (base+altezza)*2;
    }

    public double getArea()
    {
        return base*altezza;
    }

}
