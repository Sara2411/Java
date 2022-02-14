public class Punto {

    private double x;
    private double y;
    private double z;
    
    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }
        
    public void sposta(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public String toString() {
      String s = "(" + x + "," + y + "," + z +")";
      return s;
    }
}
