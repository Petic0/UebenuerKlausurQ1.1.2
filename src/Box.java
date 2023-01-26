public class Box {

    private final String name;
    private Box below;

    public Box(String pname) {
        this.name = pname;
    }

    public String getName() {
        return name;
    }

    public Box getBelow() {
        return below;
    }

    public void setBelow (Box pBelow) {
        below = pBelow;
    }
}
