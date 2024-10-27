public class Multi_level_inheritance{
    public static void main(String[] args) {
      dog tinku = new dog();
      tinku.eat();
      tinku.legs = 4;
      System.out.println(tinku.legs);
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class mammal extends Animal{
    int legs;
}
class dog extends mammal{
    String breed;
}
