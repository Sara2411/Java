public class Main {
    
    public static void main (String[]args) {

        SupportoMusicale s = new SupportoMusicale();
        s.setnomeBrano1("nomeBrano1");
        //System.out.println(s);
        //s.getnomeBrano();

        SupportoMusicale t = new SupportoMusicale();
        t.setnomeBrano2("nomeBrano2");

        SupportoMusicale u = new SupportoMusicale();
        u.setnomeBrano2("nomeBrano3");

        boolean a = s.equals(t);
        System.out.println(a);

        RiproduttoreMusicale r = new RiproduttoreMusicale();
        r.inserisciSupporto(s);
        r.espelliSupporto(s);
        r.selectBrano("nomeBrano1");
        r.getBrano();
        r.play();
        r.stop();
        r.prev(2);
        r.next(1);
        r.toString();
        
        Nastro n = new Nastro();
        n.setNumeroBrani(5);

        Brano b = new Brano();
        b.setNomeCantante("Alvaro Soler");
    }
}
