public class Cerchio extends Forma
{

    private double raggio;

    public Cerchio(double raggio)
    {
      this.raggio = raggio;
    }

    public double getRaggio()
    {
      return raggio;
    }

    public double getCirconferenza()
    {
        return 2*Math.PI*raggio;
    }

    public double getCerchio()
    {
        return Math.PI*raggio*raggio;
    }

}
