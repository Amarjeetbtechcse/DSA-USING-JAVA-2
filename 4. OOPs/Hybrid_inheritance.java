public class Hybrid_inheritance {
    public static void main(String[] args) {
      stark sweety = new stark();
      sweety.breathe();
      sweety.eat();
      sweety.swim();
      sweety.fast();
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
class Tuna extends fish{
    void slow(){
        System.out.println("swims slow");
    }
}
class stark extends fish{
    void fast(){
        System.out.println("swims very fast");
    }
}