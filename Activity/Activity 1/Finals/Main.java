package Poly.billones;

public class Main {
    public static void main(String[] args){

        Hero a = new Assassin();
        Hero mm = new Marksman();
        Hero f = new Fighter();
        Hero m = new Mage();
        Hero t = new Tank();

        a.Stats();
        a.heroVoice();

        mm.Stats();
        mm.heroVoice();

        f.Stats();
        f.heroVoice();

        m.Stats();
        m.heroVoice();

        t.Stats();
        t.heroVoice();




    }
}
