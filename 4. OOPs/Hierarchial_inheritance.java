public class Hierarchial_inheritance{
    public static void main(String[] args) {
      fish sweety = new fish();
      sweety.breathe();
      sweety.eat();
      sweety.swim();
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
    
}
class fish extends Animal{
    void swim() {
        System.out.println("swims");
    }    
}
class bird extends Animal{
    void fly() {
        System.out.println("flies");
    }
}