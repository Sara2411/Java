public class Main {
    
    public final static void main (String[]args) {

        SupportoMusicale s = new SupportoMusicale();
        s.setTitoloBrano1("titoloBrano1");
        //System.out.println(s);
        //s.getTitoloBrano();

        SupportoMusicale t = new SupportoMusicale();
        t.setTitoloBrano2("titoloBrano2");

        SupportoMusicale u = new SupportoMusicale();
        u.setTitoloBrano2("titoloBrano3");

        boolean a = s.equals(t);
        System.out.println(a);

        RiproduttoreMusicale r = new RiproduttoreMusicale();
        r.inserisciSupporto(s);
        r.espelliSupporto(s);
        r.selectBrano("titoloBrano1");
        r.getBrano();
        r.play();
        r.stop();
        r.prev(2);
        r.next(1);
        r.toString();
        
        Nastro n = new Nastro();
        n.setNumeroBrani(5);
    }
}
