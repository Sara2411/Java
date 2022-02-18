public class Rettangolo {
        
    private double x1, x2;
    private double y1, y2;

    public void trasla(double x, double y, double a, double b, double l, double h) {
		x1 = x + a;
		y1 = y + b;
        x2 = x1 + l;
        y2 = y1 + h;
	}
    
    public String toString() {
        return "(" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ")";
    }
    
}