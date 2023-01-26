import java.util.Queue;
import java.util.Stack;

public class Main extends Koordinaten {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main first = new Main(300, 300);
        first.printInfo();


//        int[]erstes= new int[3];
//        int[]zweites= new int[3];
//        erstes[0]=2;
//        erstes[1]=3;
//        erstes[2]=5;
//        zweites[0]=7;
//        zweites[1]=11;
//        zweites[2]=13;
//        erstes[2]=23;
//        zweites=erstes;
//        zweites[1]=17;
//        System.out.println(erstes[0]);
//        System.out.println(erstes[1]);
//        System.out.println(erstes[2]);
    }

    /*
    1. Vererbung => Done
    2. Queue => Done
    3. String
        - nur Referenz
        - mit + kann man sie zusammenfügen
        - .lenght();
        - .substring(int begin, int ende);
        - .charAt(int ind);
        - Integer.parseInt("10"); , Double.parseDouble("10.9");
        - string1.equals(string2);

    4. Arrays
        - Referenzvariablen also beim Vergleichen Arrays.equals(arr1,arr2);    needs import java.util.Arrays;
        - Typ [] name = new Typ [Anzahl];
        => Done
    5. abstract Classes => Done

     */
    Main(int px, int py) {
        super(px, py);
    }
}

