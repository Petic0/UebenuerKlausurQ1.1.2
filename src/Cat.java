public class Cat extends Animal{

    public Cat(int page, String pname) {
        super(page,pname);
    }

    public static void main(String[] args) {
        Cat myCat = new Cat(10, "Luna");
        myCat.age = 10;
    }
    @Override
    public void makeNoise() {

    }
}
