public class Koordinaten {
    int x,y;
    public static void main(String[] args) {

    }
    Koordinaten(int px, int py) {
        this.x = px;
        this.y = py;
    }
    Koordinaten() {
        x = 0;
        y = 0;
    }
    void printInfo() {
        System.out.println("X: "+ x );
        System.out.println("Y: "+ y );
    }
}
