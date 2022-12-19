import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class WarteschlangenTest {

    public static void main(String[] args) {
//        Wartender peter = new Wartender("Peter");
//        peter.setNachfolger(new Wartender("Tristan"));
//        peter.getNachfolger().setNachfolger(new Wartender("Caesar"));
//        System.out.println(peter.getNachfolger().getName());
        Warteschlange rewe = new Warteschlange();
        rewe.stelleAn(new Wartender("Peter"));
        rewe.stelleAn(new Wartender("Tristan"));
        rewe.stelleAn(new Wartender("Roberto"));
        rewe.stelleAn(new Wartender("Zhexuan"));
        rewe.stelleAn(new Wartender("Tiziano"));
        rewe.gibInfo();
        rewe.entferneErsten();
        rewe.gibInfo();
        rewe.entferneErsten();
        rewe.entferneErsten();
        rewe.gibInfo();

    }
}
