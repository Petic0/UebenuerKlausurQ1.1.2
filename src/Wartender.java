public class Wartender {
    private String name;
    private Wartender nachfolger;

    public Wartender(String pname) {
        this.name = pname;
    }

    public String getName() {
        return name;
    }

    public Wartender getNachfolger() {
        return nachfolger;
    }
    public void setNachfolger(Wartender pNachfolger) {
        nachfolger = pNachfolger;
    }
    public void gibInfo() {
        System.out.println("Name: "+ getName());
        System.out.println("Name Nachfolger: "+ nachfolger.getName());
    }
}
