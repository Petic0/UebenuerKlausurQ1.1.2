public class Warteschlange {
    private Wartender kassierer;

    public Warteschlange() {
        kassierer = new Wartender(null);
    }
    public Wartender getLetzter () {
        Wartender laufzeiger = kassierer;
        while(laufzeiger.getNachfolger() != null) {
            laufzeiger = laufzeiger.getNachfolger();
        }
        return laufzeiger;
    }
    public void stelleAn (Wartender pNeuer) {
        getLetzter().setNachfolger(pNeuer);
    }

    public void gibInfo () {
        Wartender laufzeiger = kassierer.getNachfolger();
        while(laufzeiger != null) {
            System.out.println(laufzeiger.getName());
            laufzeiger = laufzeiger.getNachfolger();
        }
        System.out.println("--------------------");
    }
    public void entferneErsten () {
        kassierer = kassierer.getNachfolger();
    }
}
