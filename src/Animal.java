public abstract class Animal {
   public int age;
   public String name;
   public Animal(int page, String pname) {
      this.age = page;
      this.name = pname;
   }
   public abstract void makeNoise();
}
