public class Triangolo2 extends Forma
{
    
    private double base;
    private double altezza;
    private double lato1;
    private double lato2;
    

    public Triangolo2(double base, double altezza, double lato1, double lato2)
    {
      this.base = base;
      this.altezza = altezza;
      this.lato1 = lato1;
      this.lato2 = lato2;
    }

    public double getBase()
    {
      return base;
    }

    public double getAltezza()
    {
      return altezza;
    }

    public double getLato1()
    {
        return lato1;
    }

    public double getLato2()
    {
        return lato2;
    }
  
    public double getPerimetro()
    {
        return base+lato1+lato2;
    }

    public double getArea()
    {
        return (base*altezza)/2;
    }

}
