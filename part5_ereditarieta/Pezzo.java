public class Pezzo {

    public enum Operazione 
    {
        LEFT,
        RIGHT,
        ROTATE,
        DOWN;
    }
    
    private static final double g = 9.81;
    private double velocita;
    private double spazio;
    private double tempo;
    private double velocitaangolare;
    private double raggio;
    
    public void muoviti (Operazione o)
    {
      switch(o) {
      case LEFT: velocita += velocita + spazio/tempo; break;
      case RIGHT: velocita += velocita -spazio/tempo; break;
      case ROTATE: velocita += velocita + velocitaangolare*raggio; break;
      case DOWN: velocita += velocita -g*tempo; break;
      default: System.out.println("Direzione non ammessa"); break;
      }
    }
}