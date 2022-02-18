public class Colore {

    int Bianco;
    int Nero;
    int B;
    int G;
    int R;

    public int getB() {
      return B;
    }

    public void setB(int b) {
      if(b>255 || b<0) {
        throw new InternalError("Valore non valido");
      } else
      B = b;
    }

    public int getG() {
      return G;
    }

    public void setG(int g) {
      if(g>255 || g<0) {
        throw new InternalError("Valore non valido");
      } else
      G = g;
    }

    public int getR() {
      return R;
    }

    public void setR(int r) {
      if(r>255 || r<0) {
        throw new InternalError("Valore non valido");
      } else
      R = r;
    }

    
    
  } 
